package Interview;

public class RevereseStringDemo {

	
	public static void main (String [] args){
	    
	    String sample= "Hello Maneesh";
//	    String str="";
//	   int  m= sample.length();
//	    
//	        for(int i=m-1; i>=0;i--){
//	        
//	        str= str+ sample.charAt(i);
//	        
//	        }
//	    
//	      System.out.println("The reversed string is ="+str);
//	    
//	    
	    for(int i=sample.length()-1; i>=0;i--) {
	    	
	    	
	    	
	    	System.out.print(sample.charAt(i));
	    }
	    
	  

			String Sample="Programming";

			char[] ch= Sample.toCharArray();


			int m= Sample.length();
			char[] ch1= new char[m];
			int index=0;


			for(int i = m-1; i>=0;i--){

			 ch1[index] = Sample.charAt(i);
			 index++;


			}

			System.out.println("---------");

			for(int i=0;i<ch1.length;i++){


			System.out.print(ch1[i]);
			}

	    
	    
	    
	}	    
}
