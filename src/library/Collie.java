package library;

public class Collie extends Dog implements IBirthday{
	
	public Collie(String name, String bark, int age) {
		super(name, bark,age);
		}
	@Override
	public void birthday() {
		System.out.println("Happy birthday");
	}

	
public Collie () {}
}
