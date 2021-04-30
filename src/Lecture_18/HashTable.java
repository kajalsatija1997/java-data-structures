package Lecture_18;

public class HashTable<K,V> {

	private class HTPair{
		K key;
		V value;
		HTPair(K key,V value)
		{
			this.key=key;
			this.value=value;
		}
		public boolean equals(Object other)
		{
			HTPair op=(HTPair) other;
			return this.key.equals(op.key);
		}
		public String toString()
		{
			return "{"+this.key+":"+this.value;
		}
	}
	private int size;
	private Generic_linked_list<HTPair>[] bucketArray;
	public static final int DEFAULT_CAPACITY=10;
	public HashTable()
	{
		this(DEFAULT_CAPACITY);
	}
	public HashTable(int capacity)
	{
		this.bucketArray=(Generic_linked_list<HTPair>[]) new Generic_linked_list[capacity];
		this.size=0;
	}
	public void put(K key,V value) throws Exception
	{
		int bi=this.hashFunction(key);
		Generic_linked_list <HTPair> bucket=this.bucketArray[bi];
		HTPair pta=new HTPair(key,value);
		if(bucket==null)
		{
			bucket =new Generic_linked_list<>();
			bucket.addLast(pta);
			this.size++;
			this.bucketArray[bi]=bucket;
		}
		else
		{
			int foundAt=bucket.find(pta);
			if(foundAt==-1)
			{
				bucket.addLast(pta);
				this.size++;
			}
			else
			{
				HTPair pair=bucket.getAt(foundAt);
				pair.value=value;
			}
		}
		double lamda=(this.size*1.0)/this.bucketArray.length;
	}
	private int hashFunction(K key)
	{
		int hc=key.hashCode();
		hc=Math.abs((hc));
		int bi=hc%this.bucketArray.length;
		return bi;
	}
	public void display()
    {
	for(Generic_linked_list<HTPair> bucket:this.bucketArray)
	{
		if(bucket!=null&&!bucket.isEmpty())
	{
		bucket.display();	
	}
		else
		{
			System.out.println("NULL");
		}
	}
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	public V get(K key) throws Exception
	{
		int bi=this.hashFunction(key);
		Generic_linked_list<HTPair> bucket =this.bucketArray[bi];
		HTPair ptf=new HTPair(key,null);
		if(bucket==null)
		{
			return null;
		}
		else
		{
			int foundAt=bucket.find(ptf);
			if(foundAt==-1)
			{
				return null;
			}
			else
			{
				HTPair pair=bucket.getAt(foundAt);
				return pair.value;
			}
		}
	}
	public V remove(K key) throws Exception
	{
		int bi=this.hashFunction(key);
		Generic_linked_list<HTPair> bucket =this.bucketArray[bi];
		HTPair ptf=new HTPair(key,null);
		if(bucket==null)
		{
			return null;
		}
		else
		{
			int foundAt=bucket.find(ptf);
			if(foundAt==-1)
			{
				return null;
			}
			else
			{
				HTPair pair=bucket.getAt(foundAt);
				bucket.removeNodeAt(foundAt);
				this.size--;
				return pair.value;
			}
		}
	}
	private void rehash()
	{
		
	}
}


