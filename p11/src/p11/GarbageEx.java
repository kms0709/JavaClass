package p11;

public class GarbageEx {

	public static void main(String[] args) {
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d, e = null;
		a = null;
		d = c;
		c = null;
		
		System.out.println("a : " +a);
		System.out.println("b : " +b);
		System.out.println("c : " +c);
		System.out.println("d : " +d);
		System.out.println("e : " +e);

	}

}
