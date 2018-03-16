import java.util.*;
public class hashmap2 {

   public static void main(String args[]) {
   
      Scanner scn=new Scanner(System.in);
   
      // Create a hash map
      HashMap hm = new HashMap();
      
      // Put elements to the map
      hm.put(91, "India");
      hm.put(61, "AUS");
      hm.put(1, "USA");
      hm.put(44,"UK");
      hm.put(86,"CHINA");
      
      //size of the map
      System.out.println("Size of map :"+hm.size());
      
      // Display map
      if(hm.isEmpty())
      	 System.out.println("Map is empty");
      else
     	 System.out.println(hm);
     	 
    //Accessing the elements
     System.out.println("Enter the country code");
     int key=scn.nextInt();
     if(hm.containsKey(key))
     	System.out.println(hm.get(key));
     else
     	System.out.println("NOT FOUND :(");
     	
     //
     
     System.out.println("Enter the country code u wanna delete");
     int key2=scn.nextInt();
     if(hm.containsKey(key2))
     	{
     		hm.remove(key2);
     		System.out.println(hm);
     	}
     else
     	System.out.println("NOT FOUND :(");
     	
     	//
     	
     	 System.out.println("Enter the country code and country u wanna insert");
     int key3=scn.nextInt();
     String value=scn.next();
     if(hm.containsKey(key3))
     	{
     		System.out.println("key already exists");
     	}
     else
     {
     	hm.put(key3,value);
     	System.out.println(hm);
     }
     
   }
} 
