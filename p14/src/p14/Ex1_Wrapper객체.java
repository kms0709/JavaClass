package p14;

public class Ex1_Wrapper객체 {

	public static void main(String[] args) {
		 Integer i = Integer.valueOf(10);
		 Character c = Character.valueOf('c');
		 Double f = Double.valueOf(3.14);
		 Boolean b = Boolean.valueOf(true);
		 
		 System.out.println(i.getClass()); // class java.lang.Integer
		 System.out.println(i.getClass().getName()); // java.lang.Integer
	}

}
