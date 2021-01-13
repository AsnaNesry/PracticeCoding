package test;
public class StringExampleTest {

	public static void main(String[] args) {
		String s1="hello";
		String s2="wassup";
		System.out.println("string length is:"+s1.length());
		System.out.println("string length is:"+s2.length());
		
		String sel="hello";
		sel=sel.concat("how are you");
		System.out.println("############################################");
		System.out.println(sel);
		
		String stl="hello";
		System.out.println(stl+"how are you");
		System.out.println(stl.trim()+"how are you");
		
		String sL="HOW ARE YOU";
		String slLower=sL.toLowerCase();
		System.out.println("############################################");
		System.out.println(slLower);
		
		String scl="how are you";
		String replaceChar=scl.replace('h','t');
		System.out.println(replaceChar);
		
		String srl="hey, welcome to infosys";
		String replaceString=srl.replace("Iinfosys","TCS");
		System.out.println("############################################");
		System.out.println(replaceString);
		
		String name="hello how are you doing";
		System.out.println("############################################");
		System.out.println(name.contains("how are you"));
		System.out.println(name.contains("hello"));
		System.out.println(name.contains("fine"));
		
		String sicl="HELLO";
		String sic2="hello";
		String sic3="hi";
		System.out.println("############################################");
		System.out.println(sicl.equals(sic2));
		System.out.println(sicl.equalsIgnoreCase(sic2));
		System.out.println(sicl.equalsIgnoreCase(sic3));
		
		String ssl="hello";
		String ss2="hello";
		String ss3="hemlo";
		String ss4="flag";
		System.out.println("############################################");
		System.out.println(ssl.compareTo(ss2));
		System.out.println(ssl.compareTo(ss3));
		System.out.println(ssl.compareTo(ss4));
		
		
		
		
		
		
		
		
		

	}

}
