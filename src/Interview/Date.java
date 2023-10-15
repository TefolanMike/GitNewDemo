package Interview;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sample= "08-04-2022";
		String output= "08-April-2022";
		
		String [] st=sample.split("-");
		System.out.println(st[0]);
		System.out.println(st[1]);
		System.out.println(st[2]);
		
		System.out.println("the final output is ="+st[0]+"-"+"April"+"-"+st[2]);
		
		String s = "";
		System.out.println(s.length());
	}

}
