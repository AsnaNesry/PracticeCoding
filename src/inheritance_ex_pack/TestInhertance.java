package inheritance_ex_pack;

public class TestInhertance {

	public static void main(String[] args) {

		Sub_class sc=new Sub_class();
		sc.super_display();
		sc.display();
		System.out.println("Inside superclass constructor "+sc.super_name);
		System.out.println("Inside subclass constructor "+sc.name);
		

	}

}
