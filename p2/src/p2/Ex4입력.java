package p2;
import java.util.Scanner;

public class Ex4입력 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String line = "-----------------------";
		
		while (true)
		{
			// 입력
			System.out.print("a? "); int a = sc.nextInt();
			System.out.print("b? "); int b = sc.nextInt();
			
			if (a == b) break;
			
			// 출력
			System.out.println(line);
			System.out.printf("%d + %d = %6d\n", a, b, a + b);
			System.out.printf("%d - %d = %6d\n", a, b, a - b);
			System.out.printf("%d * %d = %6d\n", a, b, a * b);
			System.out.printf("%d / %d = %6d\n", a, b, a / b);
			System.out.printf("%d %% %d = %6d\n\n", a, b, a % b);
		}
		
		sc.close();
	}

}
