package p2;
import java.util.Scanner;

public class Ex6성적 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner tc = new Scanner(System.in);
		String line = "-------------------";
		
		while (true)
		{
			// 입력
			System.out.print("이름? ");
			String name = sc.nextLine();
			
			if(name.equals("") == true) break;
			
			System.out.print("시험지 유형? ");
			String ty = tc.next();
			
			System.out.print("국어, 영어??" );
			int kor = tc.nextInt(); int eng = tc.nextInt();
			int tot = kor + eng;
			double ave = (double)tot / 2;
			
			// 출력
			System.out.println(line);
			System.out.printf("이름 : %s\t시험지유형 : %s\n", name, ty.toUpperCase());
			//문자열.toLowerCase()
			System.out.printf("국어 : %3d\t영어 : %3d\n", kor, eng);
			System.out.printf("총점 : %3d\t평균 : %5.1f\n", tot, ave);
		}
		
		sc.close();
		tc.close();
		
		System.out.println("종료");
	}
}
