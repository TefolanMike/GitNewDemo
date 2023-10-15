package Interview;

public class DeleteCharacgerAgain {

	
	public static void main (String[] args){
		
		
		//javTpoint sheblrgw
		
		
		String rev = "javaTpoint is the best learning website";
		char[] ch= rev.toCharArray();
		 int len = ch.length;
		 int index = 0;   
		 char[] chararray= new char[len];
		
		 for (int i = 0; i < len; i++)   
	        {   
	              
	            // Check whether str[i] is present before or not   
	            int j;   
	            for (j = 0; j < i; j++)    
	            {   
	                if (ch[i] == ch[j])   
	                {   
	                    break;   
	                }   
	            }   
	    
	            // If the character is not present before, add it to resulting string   
	            if (j == i)    
	            {   index++;
	            	chararray[index] = ch[i];  
	            	System.out.print(chararray[index]);
	            }   
	        } 
		
		
		
		
		
		
		
	}
}
