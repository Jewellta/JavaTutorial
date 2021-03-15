package library;

public class GermanShepherd extends Dog implements IBirthday{
	
	public void birthday() {
		System.out.println("prev age is " + getAge());
		setAge(getAge()+1);
		System.out.println("prev age is " + getAge());
	}
	
	
public GermanShepherd(String name, String bark, int age) {
	super(name, bark,age);
	}

public GermanShepherd() {
}
}


