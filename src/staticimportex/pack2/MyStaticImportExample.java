package staticimportex.pack2;

import static staticimportex.pack1.MyStaticClass.*;

public class  MyStaticImportExample {

	public static void main(String[] args) {
		System.out.println("increment value:"+INCREMENT);
		int count=10;
		System.out.println("increment count: "+incrementNumber(count));
		System.out.println("increment count: "+incrementNumber(count));
		
		

	}

}
