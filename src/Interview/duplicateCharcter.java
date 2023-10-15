package Interview;

import java.util.ArrayList;
import java.util.Iterator;

public class duplicateCharcter {

	public static void main (String[] args){

		String sample= "Asgabdebdb";
		char[] ch= sample.toCharArray();
		
		ArrayList<Character> nonDupList = new ArrayList<Character>();
		// Iterator<Character> dupIter = sample.iterator();
//	        while(dupIter.hasNext())
//	        {
//	        String dupWord = dupIter.next();
//	        if(nonDupList.contains(dupWord))
//	        {
//	            dupIter.remove();
//	        }else
//	        {
//	            nonDupList.add(dupWord);
//	        }
//	        }
	      System.out.println(nonDupList);
		
		
}
}