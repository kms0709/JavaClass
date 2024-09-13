package p2;
import java.util.Scanner;

public class Ex5입력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 고향 나이 체중 결혼여부를 입력하시오");
		String name = sc.next();			// "Kim"
		String city =sc.next();				// "Seoul"
		int age = sc.nextInt();				// 20
		double weight = sc.nextDouble();	// 65.1
		boolean single = sc.nextBoolean();	// true
		
		System.out.println("이름: " + name);
		System.out.println("고향: " + city);
		System.out.println("나이: " + age);
		System.out.println("체중: " + weight);
		System.out.println("결혼여부: " + single);
		
		sc.close();
	}

}
