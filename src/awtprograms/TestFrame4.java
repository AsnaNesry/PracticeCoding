package awtprograms;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class TestFrame4 extends Frame {
	Panel pan;
	Label one;
	Label two;
	Label three;

	TestFrame4() {
		pan = new Panel();
		one = new Label("one", Label.LEFT);
		two = new Label("two", Label.CENTER);
		three = new Label("three", Label.RIGHT);

		pan.add(one);
		pan.add(two);
		pan.add(three);

		add(pan);

		setSize(300, 300);
		setTitle("My First Frame");
		setVisible(true);
	}// end of constructor

	public static void main(String[] args) {
		TestFrame4 tf4 = new TestFrame4();

	}// end of main method

}// end of class
