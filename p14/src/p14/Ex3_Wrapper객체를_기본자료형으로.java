package p14;

public class Ex3_Wrapper객체를_기본자료형으로 {

	public static void main(String[] args) {
		Integer i = Integer.valueOf(10);
		System.out.println("i : " + i + "\t" + (i + 100));
		//int ii = i.intValue(); // ii = 10 // (Integer --> int)Unboxing
		int ii = i;
		System.out.println("ii : " + ii);

		//Character c = Character.valueOf('c'); // boxing
		Character c = 'c'; // boxing
		char cc = c.charValue(); // cc = ’c’ // unboxing
		System.out.println("c : " + c);
		System.out.println("cc : " + cc);
		
		Double d = Double.valueOf(3.14);
		//double dd = d.doubleValue(); // dd = 3.14
		double dd = 3.14;
		System.out.println("d : " + d);
		System.out.println("dd : " + dd);

		Boolean b = Boolean.valueOf(true);
		boolean bb = b.booleanValue(); // bb = true
		System.out.println("b : " + b);
		System.out.println("bb : " + bb);
	}

}
