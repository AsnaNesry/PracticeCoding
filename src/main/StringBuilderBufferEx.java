package main;
//package test;
public class StringBuilderBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println("first hashcode is:"+sb1.hashCode());
		System.out.println("Length is:"+sb.length());
		System.out.println("capacity is:"+sb.capacity());
		System.out.println(sb1);
		System.out.println(sb1.append("World...."));
		System.out.println("After changing hashcode is:"+sb1.hashCode());
		System.out.println("length is:"+sb1.length());
		System.out.println("capacity is:"+sb1.capacity());
		System.out.println(sb1);
		System.out.println(sb1.reverse());
		
		
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder("Hello");
		System.out.println("length is:"+sb2.length());
		System.out.println("capacity is:"+sb2.capacity());
		System.out.println(sb3);
		System.out.println("length is:"+sb3.length());
		System.out.println("capacity is:"+sb3.capacity());
		
		
		
		
		
		
		
		

	}

}
