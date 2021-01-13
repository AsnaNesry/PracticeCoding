package src.testpack2;

import src.testpack1.SuperClassOne;

public class SubClassOne extends SuperClassOne{
	SubClassOne(){
		super();
	}
	void printValue() {
		System.out.println("company name is"+name);
		displayValue();
	}

}
