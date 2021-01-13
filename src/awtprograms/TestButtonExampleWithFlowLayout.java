package awtprograms;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class TestButtonExampleWithFlowLayout extends Frame {
	TestButtonExampleWithFlowLayout(String title) {
		super(title);
	}// end of constructor

	public static void main(String[] args) {
		TestButtonExampleWithFlowLayout tbe1 = new TestButtonExampleWithFlowLayout("Buttons using flow layout");
		Button b1 = new Button("one");
		Button b2 = new Button("two");
		Button b3 = new Button("three");
		Button b4 = new Button("four");
		Button b5 = new Button("five");

		tbe1.add(b1, BorderLayout.EAST);
		tbe1.add(b2, BorderLayout.WEST);
		tbe1.add(b3, BorderLayout.NORTH);
		tbe1.add(b4, BorderLayout.SOUTH);
		tbe1.add(b5, BorderLayout.CENTER);

		tbe1.setLayout(new FlowLayout());

		tbe1.setBounds(700, 300, 300, 300);
		tbe1.setVisible(true);

	}// end of main method

}// end of class
