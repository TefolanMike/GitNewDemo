package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class duplicate {
	
	
	static  void sortDuplicateElements(int[] array){
	int temp=0;
	int newarrayLen=0;
	int[] newArray= new int[3];	
	//System.out.println(array[3]);
	for(int i=0;i<array.length;i++){
		
		for(int j=i+1;j<array.length;j++) {
			
		if(array[i]==array[j]) {
			System.out.println(array[j]);
			newArray[newarrayLen]= array[j];
			newarrayLen=newarrayLen+1;                                                                                                                                                                                                                               
			
		}
		
		}
	}
	for(int i=0; i<=newArray.length-1;i++)
	{
		System.out.println(newArray[i]+" ");
	}
	
	
	}
//	if(array[i]!=array[j]){
//	 array[i+1]=array[j];
//	i++;
//	}
//	}
//	return i+1;
//	}

public static void main (String[] args){
int[] array=new int[]{ 1, 2, 3, 2, 3,4,5,5,6 };

sortDuplicateElements(array);


ArrayList<Integer> namesList= new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,4,4,4,5,6));
LinkedHashSet<Integer> noDupl= new LinkedHashSet <Integer>(namesList);
System.out.println(noDupl);

ArrayList<Integer> finalList= new ArrayList<Integer>(noDupl);

System.out.println(finalList);











}
}