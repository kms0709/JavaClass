package p5;
import java.util.Scanner;
/* 이름? 홍 길 동
 * 국어, 영어?? 95 100
 * ------------------------
 * 이름 : xxx
 * 평균 : xxx.x	평가 : x
 * 	계속하시겠어요(Y/y/N/n)? n
 * 작업을 종료합니다.
 * */
public class Ex2성적 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner tc = new Scanner(System.in);
		String line = "-----------------------------";
		char grade = '@';
		
		while (true)
		{
			// 사용자 입력
			System.out.print("이름? ");
			String name = sc.nextLine(); // 이름
			
			System.out.print("국어, 영어?? ");
			int kor = tc.nextInt(); // 국어
			int eng = tc.nextInt(); // 영어
			
			// 계산
			float ave = (float)(kor + eng) / 2; // 평균 계산
			switch ((int)ave / 10) // 평가 계산
			{
			case 10:
			case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			default: grade = 'F'; break;
			}
			
			// 화면 출력
			System.out.println(line);
			System.out.printf("이름 : %s\n", name);
			System.out.printf("평균 : %5.1f\t평가 : %c\n", ave, grade);
			String ch =null;
			do {
			System.out.println("\t계속하시겠어요(Y/y/N/n)? ");
			
			ch = tc.next().toLowerCase();//	"Y".toLowerCase()--> "y"
			//System.out.println("ch : "+ch);
			}while( ch.equals("y") == false && ch.equals("n") == false);
			//"y", "n"
			
			//break;
		} // while (true)
		
		//tc.close();
		//sc.close();
	}

}
