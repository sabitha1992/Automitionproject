package JAVA;

import java.util.ArrayList;

public class ArryListEx {
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add("computer");
	list.add(2, "mani");//if we want to add
	list.remove(2);//if we want remove
	//System.out.println(list.contains("mani"));//or
	System.out.println("check mani exists:" + list.contains("mani"));
	System.out.println("check computer exist:"+list.contains("computer"));
System.out.println(list.size());
	System.out.println(list);
	 
	
	//System.out.println(list.get(4));
	//if you want to get the list for one by one than
	//
	int count = list.size();
	for (int i = 0; i < list.size(); i++) {
	System.out.println(list.get(i));
	
//	//for each loop
//	for (Object array : list) {
//		System.out.println(array);
//	}
	
	
	
	}
	
}
}

	
	
	
	
	
	


