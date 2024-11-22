package packA;

public class Ex1_instanceof연산자 {

	public static void main(String[] args) {
		Person p = new Professor();

		System.out.println(p instanceof Person); 	// true
		System.out.println(p instanceof Student); 	// false. Student를 상속받지 않기 때문
		System.out.println(p instanceof Researcher);	// true
		System.out.println(p instanceof Professor); // true
		System.out.println("java" instanceof String); // true

	}

}
