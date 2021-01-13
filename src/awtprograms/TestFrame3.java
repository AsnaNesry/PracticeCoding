package awtprograms;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class TestFrame3 extends Frame {

	public static void main(String[] args) {
		TestFrame3 tf3 = new TestFrame3();

		Panel pan = new Panel();
		Label one = new Label("one", Label.LEFT);
		Label two = new Label("two", Label.CENTER);
		Label three = new Label("three", Label.RIGHT);

		pan.add(one);
		pan.add(two);
		pan.add(three);

		tf3.add(pan);

		tf3.setSize(300, 300);
		tf3.setTitle("My First Frame");
		tf3.setVisible(true);

	}

}
