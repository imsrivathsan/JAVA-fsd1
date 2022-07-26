package PracticeProject;
import java.util.*;
public class MapsDemo {
	public static void main(String[] args) {
		// map
		
		//Hashmap
		HashMap<Integer,String> s=new HashMap<Integer,String>();      
	      s.put(1,"Srivathsan");    
	      s.put(2,"RohitSharma");    
	      s.put(3,"KLR");   
	       
	      System.out.println("\nHashmap: ");  
	      for(Map.Entry m:s.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> s1=new Hashtable<Integer,String>();  
	      
	      s1.put(4,"Sathyavathi");  
	      s1.put(5,"Prahalath");  
	      s1.put(6,"Hariprasath");  
	      s1.put(7,"Ashwini");  

	      System.out.println("\nHashTable:");  
	      for(Map.Entry n:s1.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> s2=new TreeMap<Integer,String>();    
	      s2.put(8,"memejoker");    
	      s2.put(9,"mumbai");    
	      s2.put(10,"chennai");       
	      
	      System.out.println("\n TreeMap:");  
	      for(Map.Entry l:s2.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	}  
	
}
