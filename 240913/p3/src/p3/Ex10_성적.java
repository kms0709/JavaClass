package p3;
/*비고는 평균이 85 이상이면 집으로...
  그 외는 면담요망!의 문자열 출력
이름? 홍 길 동
시험지유형? b
국어?영어? 90 100
---------------------
이름: xxx	  시험지유형: x
국어: xxx  영어: xxx
총점: xxx  평균: xxx.x
비고: xxx
이름? 홍길
시험지유형? A
국어?영어? 90 100
---------------------
이름: xxx	  시험지유형: A(대문자)
국어: xxx  영어: xxx
총점: xxx  평균: xxx.x
비고: xxx
이름?(아무입력없이 Enter)
종료
*/
import java.util.Scanner;
public class Ex10_성적 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner tc=new Scanner(System.in);
		String line="----------------------------";
		while(true) {
		System.out.println("이름? ");
		String name=sc.nextLine();
		if(name=="")break;
		System.out.println("시험지유형? ");
		String ty=tc.next();
		System.out.println("국어, 영어? ");
		int kor=tc.nextInt(); int eng = tc.nextInt();
		int tot = kor+eng;
		double ave = (double)tot/2;
		String bigo=(ave>=85) ? "집으로...":"면담 요망!";
		System.out.println(line);
		System.out.printf("이름 : %s\t시험지유형 : %s\n",name,ty.toUpperCase());
		//문자열.toLowerCase()
		System.out.printf("국어 : %3d\t영어 : %3d\n",kor,eng);
		System.out.printf("총점 : %3d\t평균 : %5.1f\n",tot,ave);
		System.out.printf("비고 : %s\n\n"+bigo);
		}
		sc.close();
		tc.close();
		System.out.printf("종료");

	}

}
