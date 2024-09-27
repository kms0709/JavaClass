package p4;
import java.util.Scanner;

public class Ex8소수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			System.out.print("수? ");
			int num = sc.nextInt();
			if (num < 1) break;
			
			boolean sw = false;
			int i;
			for (i = 2; i < num; i++)
			{
				if (num % i == 0)
				{
					sw = true;
					break;
				}
			} // for
			
			String pan = (sw == false && num == i) ? "소수임" : "소수아님";
			System.out.println(num + " : " + pan);
		} // while
		
		System.out.println("종료합니다.");
		sc.close();
	}

}
