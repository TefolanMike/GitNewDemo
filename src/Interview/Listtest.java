package Interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Listtest {
	
	  public static void main (String[] args){
	
	int [] a= new int [] {1,2,3,4,5,6};
	int [] b=new int[] {5,6,7,8,9,10};
	int index=0;
	int temp[]= new int[10];

	        
	 ArrayList<Integer> arr1= new ArrayList<Integer>();  
	 
	 for(int j=0;j<a.length;j++){
	     for(int k=0;k<b.length;k++){
	         
	         if(a[j]==b[k]){
	             
	            temp[index]= a[j];
	             
	             index++;
	         }
	         
	         
	     }
	     
	     
	     
	     
	 }
	 for(int i=0; i<2;i++)
	 {
	 System.out.print(temp[i]);
	 }
	 
	 for(int i=0;i<a.length;i++) {
	 arr1.add(a[i]);
	
	  arr1.add(b[i]);
	 
	 }
	  
	 Set<Integer> set= new HashSet<Integer>(arr1);
	 
	 for(int l=0;l<temp.length;l++){
	     
	     if(set.contains(temp[l])) {
	    	 
	    	 set.remove(temp[l]);
	    	 
	    	 
	     }
	   
	
	        
	        
	    }
	 
	 
	 System.out.println(set);

	  }
}
