package awtprograms;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class TestButtonExample1 extends Frame {
	TestButtonExample1(String title) {
		super(title);
	}// end of constructor

	public static void main(String[] args) {
		TestButtonExample1 tbe = new TestButtonExample1("Frame with Buttons");
		Button b1 = new Button("one");
		Button b2 = new Button("two");
		Button b3 = new Button("three");
		Button b4 = new Button("four");
		Button b5 = new Button("five");

		tbe.add(b1, BorderLayout.EAST);
		tbe.add(b2, BorderLayout.WEST);
		tbe.add(b3, BorderLayout.NORTH);
		tbe.add(b4, BorderLayout.SOUTH);
		tbe.add(b5, BorderLayout.CENTER);

		tbe.setBounds(700, 300, 300, 300);
		tbe.setVisible(true);

	}// end of main method

}// end of class
