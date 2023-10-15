package Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sample= "Great responsibility";
		char[] ch= sample.toCharArray();
		int n= ch.length;

		Map<Character, Integer> map= new HashMap<Character, Integer>();

		for(int i=0;i<n;i++){

		if(map.containsKey(ch[i])){


		map.put(ch[i],map.get(ch[i])+1);
		}

		else{
		map.put(ch[i],1);

		}
		}
		
		for(Entry<Character, Integer> entry: map.entrySet()) {
			
			
			//System.out.println("the character is ="+entry.getKey()+" "+"the occurrence is="+entry.getValue());
			
			if(entry.getValue()> 1) {
				
				System.out.println("the character with more than one occurrence  is ="+entry.getKey()+" "+
				"the occurrence value is="+entry.getValue());
				
			}
		}
		
		
			
			
			
			
		}
	}


