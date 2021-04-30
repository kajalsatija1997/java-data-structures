package lecture5;

public class String_builderss {

	public static void main(String[] args) {
		String s="Hello";
		//toggle(s);
		insert(s);
		
	}
	public static void toggle(String s) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			char ch=sb.charAt(i);
			if(ch>=65&&ch<=90)
			   {
				char tbi=(char)(ch+32);
				  sb.append(ch);
			   }
				   if(ch>=97&&ch<=122)
				   {
					   char tbi=(char)(ch-32);
					   sb.append(tbi);
				   }
				   }
		}
	public static void insert(String s) {
		StringBuilder sb=new StringBuilder();
		
//		if(ch%2!=0){	
//		}
//		for(int i=0;i<s.length();i++)
//		{
//			char ch=s.charAt(i);
//		for(int j=i+1;i<s.length();i++)
//		{ char ch2=s.charAt(i);
//			int diff= ch2-ch;
//		}
//			System.out.println(ch+""+ch+1);
//			
//		}
//		
	}
		}
	
		
