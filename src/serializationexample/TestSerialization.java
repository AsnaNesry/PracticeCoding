package serializationexample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) {
		// object serialization code
		try (ObjectOutputStream objstream = new ObjectOutputStream(new FileOutputStream("D:\\Employee.txt"))) {
			Employee obj1 = new Employee("Raj", "Pridwi", 35);
			System.out.println("\n before serialization....");
			System.out.println(obj1);
			objstream.writeObject(obj1);

		} catch (IOException e) {
			System.out.println("Exception during serialization...........");

		}
		try (ObjectInputStream objstream1 = new ObjectInputStream(new FileInputStream("D:\\Employee.txt"))) {
			Employee obj2 = (Employee) objstream1.readObject();
			System.out.println("\n after serialization....");
			System.out.println(obj2);

		} catch (IOException | ClassNotFoundException cnf) {
			System.out.println("Exception during serialization..........");

		}

	}

}
