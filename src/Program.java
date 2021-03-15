import library.*;

public class Program {
	public static void main(String[] args){
		
		GermanShepherd gs = new GermanShepherd("King", "Woof", 2);
		gs.birthday();
		Collie col = new Collie ("Lassie", "Ruff", 50);
		
		//Dog[] dogs = new Dog[] {gs, col};
		IBirthday[] dogs = new IBirthday[2];
		dogs[0]=gs;
		dogs[1]=col;
		for(IBirthday dog: dogs) {
			System.out.print(" The dogs birthday: ");
			dog.birthday();
		}
				
				
//		int a =12;
//		int b =13;
//		
//		int answer = Mathematics.add(1, 2);
//		System.out.println(answer);
//		
//		int answer2 = Mathematics.sub(1, 2);
//		System.out.println(answer2);
//		
//		int answer3 = Mathematics.div(1, 2);
//		System.out.println(answer3);
//		
//		int answer4 = Mathematics.mult(1, 2);
//		System.out.println(answer4);
//		
//		int answer5 = Mathematics.mod(1, 2);
//		System.out.println(answer5);
//		
//		int answer6 = Mathematics.pow(1, 2);
//		System.out.println(answer6);
//		
//		// System.out.printf("add(%d,%d")=%d\n",a,b, math.add(a,b));
		
		
		
	}

}
