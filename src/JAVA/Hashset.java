package JAVA;

import java.util.HashSet;

public class Hashset {

public static void main(String[] args) {
HashSet hs = new HashSet();
//insertion
System.out.println(hs.add("Manikanth"));//dupliacate values not allowed
System.out.println(hs.add("Manikanth"));
hs.add("Yashwitha");
hs.add("Manikanth");
hs.add(100);
hs.add(200);
hs.add("Yashu");

System.out.println(hs);
//the insert order is not preserved
System.out.println(hs.size()); 
System.out.println("size"+hs.size());
//fetch=get(h)(hashcode)
//it defines size
//cannot use regular for loop
//by using advance for loop we get value because it doesnot fetch values from index
for (Object value : hs) {//using advance for each loop not only collection we can also use in arrays and list also
System.out.println(value);


	


//if (value=="string") {
//if (hs.contains("Yashwitha")) {

}





}}
	




