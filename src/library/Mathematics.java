package library;

public class Mathematics {

	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int sub(int a, int b) {
		return a-b;
	}
	
	public static int mult(int a, int b) {
		return a*b;
	}
	
	public static int div(int a, int b) {
		return a/b;
	}
	
	public static int mod(int a, int b) {
		return a-(a/b*b);
	}
	public static int pow(int a, int b) {
		int answer =1;
		for (int idx =0; idx <b; idx ++)
			answer *= a;
		return answer;
		
	}
}

