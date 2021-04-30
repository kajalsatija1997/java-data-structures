package Lecture_18;

import java.util.HashMap;

public class client {

	public static void main(String[] args)throws Exception {
		HashTable<String,Integer> map=new HashTable<>();
		map.put("India", 300);
        map.put("USA", 200);
        map.put("UK", 150);
        map.put("Russia", 250);
        map.put("China", 320);
        map.put("Africa", 180);
        
        map.display();
        
        System.out.println(map.get("India"));
	}

}
