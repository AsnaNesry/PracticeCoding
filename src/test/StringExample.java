package test;

public class StringExample {

	public static void main(String[] args) {
		String s1="Hello";
		System.out.println(s1);
		System.out.println("s1="+s1.hashCode());
		
		String s2= new String("Hello");
		System.out.println(s2);
		System.out.println("s2="+s2.hashCode());
		
		System.out.println(s1.concat("World").hashCode());
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		String s3="Hello";
		System.out.println(s3);
		System.out.println("s3="+s3.hashCode());
		
		String s4= new String("HelloWorld");
		System.out.println(s4);
		System.out.println("s4="+s4.hashCode());
		
		
		
		
		
		

	}//end of main

}//end of class
