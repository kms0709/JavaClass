package p14;

public class Ex1_Wrapper객체 {

	public static void main(String[] args) {
		// 기본 타입의 값으로 Wrapper 객체 생성
		//Integer i = Integer.valueOf(10);
		Integer i = 10; // OK. 자동으로 Integer 객체로 됨.(Boxing)
		//Integer i = new Integer(10);
		 
		//Character c = Character.valueOf('c');
		Character c = 'c';
		
		//Double f = Double.valueOf(3.14);
		Double f = 3.14;
		
		//Boolean b = Boolean.valueOf(true);
		Boolean b = true;
		
		System.out.println(i.getClass()); // class java.lang.Integer
		System.out.println(i.getClass().getName()); // java.lang.Integer
		 
		// 변수 출력
		System.out.println("i : " + i);
		System.out.println("c : " + c);
		System.out.println("f : " + f);
		System.out.println("b : " + b);
	}

}
