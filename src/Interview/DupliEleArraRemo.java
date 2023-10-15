package Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DupliEleArraRemo {
	
	public static void main(String[] args) {

	
int [] array= {10,20,30,30,40,4,6,9,5,6,9,12,15,57,1,1,1};
    
    Map<Integer,Integer> map1= new HashMap<Integer,Integer>();
    
    for(int i=0;i<array.length;i++){
    	
    if(map1.containsKey((array[i]))){

      map1.put(array[i],map1.get(array[i])+1);
   
    }	
    else{
    	
    map1.put(array[i],1);	
    	
    }	

    	
    }
    ArrayList<Integer> arr1= new ArrayList<Integer>();  
    
   
    for(Integer e: map1.keySet()) {
    

     arr1.add(e);
    
    }
    System.out.println(arr1.toString());
    
    for(Entry<Integer,Integer> entry :map1.entrySet()) {
    	
    	System.out.println("the repeated element in the array is "+entry.getKey()+" "
    	    	+"the occurrence is ="+entry.getValue());
    }
    
    System.out.println("--------------------------");
    
    for(Entry<Integer,Integer> entry :map1.entrySet()) {
    	
    	if(entry.getValue()>1) {
    	
    	System.out.println("the repeated element in the array is "+entry.getKey()+" "
    	+"the occurrence is ="+entry.getValue());
    			
    	}
    	
    	
    }
    
	} 
    
    
    
    
    
  }


