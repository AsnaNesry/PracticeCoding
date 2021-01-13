
public class ThisExample {
	
	int rollno=101;
	String name="Quest";
	float sem1Mark=78.55f;
	float sem2Mark=80.55f;
	
	ThisExample(int rollno,String name,float sem1Mark,float sem2Mark){
		this.rollno = rollno;
		this.name = name;
		this.sem1Mark = sem1Mark;
		this.sem2Mark = sem2Mark;
	
	}
	
	void display() {
		System.out.println("rollno is "+rollno);
		System.out.println("name is "+name);
		System.out.println("sem1 mark is "+sem1Mark);
		System.out.println("sem2 mark is "+sem2Mark);
	}

}
