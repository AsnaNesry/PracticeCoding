package awtprograms;

import java.awt.Frame;

public class TestFrame2 extends Frame {

	TestFrame2() {
		setSize(300, 300);
		setTitle("My Second Frame");
		setBounds(700, 300, 300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {

		TestFrame2 tf2 = new TestFrame2();

	}

}
