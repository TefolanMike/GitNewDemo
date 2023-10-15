package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteDuplicateChar {

	public static void main (String[] args){

		String sample = "Asgabdebdb";
		char[] ch = sample.toCharArray();
		
		int length = ch.length;
		int index=0;
		char[] charArray= new char[length];

		for(int i=0;i<length;i++){

		int j;
		for(j=0;j<i;j++){

		if (ch[i]==ch[j]){

		break;
		}

		}


		if(j==i){
		index++;
		charArray[index]= ch[i];
		System.out.print(charArray[index]);



		}
		}



		}



		}
		    
		    
		 
		 



		

