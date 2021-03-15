import library.GermanShepherd;
import library.Mathematics;

public class Program {
	public static void main(String[] args){
		
		GermanShepherd gs = new GermanShepherd("King", "Woof", 2);
		gs.birthday();
		
				
				
		int a =0;
		int b =0;
		
		int answer = Mathematics.add(1, 2);
		System.out.println(answer);
		
		int answer2 = Mathematics.sub(1, 2);
		System.out.println(answer2);
		
		int answer3 = Mathematics.div(1, 2);
		System.out.println(answer3);
		
		int answer4 = Mathematics.mult(1, 2);
		System.out.println(answer4);
		
		int answer5 = Mathematics.mod(1, 2);
		System.out.println(answer5);
		
		int answer6 = Mathematics.pow(1, 2);
		System.out.println(answer6);
		
		
		
	}

}
