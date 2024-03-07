package SDETJavaSession;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Declare HashMap
		HashMap hm=new HashMap();
		
		//HashMap<Integer,String>hm=new HashMap<Integer,String>();   //Specific Data Type
		
		//Add Pairs[Key,Value] in HashMap
		hm.put(101,"John");
		hm.put(102,'A');
		hm.put(103,"Steve");
		hm.put(104,104);
		hm.put(105,true);
		
		System.out.println(hm);
		
		//Remove Pairs in HashMap
		hm.remove(102);
		
		System.out.println(hm);
		
		hm.remove(104,"Steve");  //Not removed as Key,Value pair is wrong
		
		System.out.println(hm);
        
		hm.put(105,"Soham");
		System.out.println(hm);
		
		hm.put(103,"Jass");
		System.out.println(hm);
		
		/*hm.put(101,"John");
		hm.put(102,"Jass");
		hm.put(103,"Steve");
		hm.put(104,"Sneha");
		
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}*/
		

	}

}
