package p5;
/*
양수 5개를 입력하세요.
56 80 42 100 78
가장 큰 수는 100입니다.
 */
//3장ppt22
import java.util.Scanner;
public class Ex6_최대값 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int ia[]; 
		ia = new int[5];
		//int max=0; // 현재 가장 큰 수
		System.out.println("양수 5개를 입력하세요.");

		for(int i=0; i<ia.length; i++) {
			ia[i] = sc.nextInt(); 		// 입력 받은 정수를 배열에 저장
		}
		
		int max = ia[0];
		int min = ia[0];
		
		for(int i=1; i<ia.length; i++) {	// 입력 받은 정수를 배열에 저장
			if(max<ia[i]) max = ia[i];// max 변경
			if(min>ia[i]) min = ia[i];// min 변경	
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
		System.out.println("가장 작은 수는 " + min + "입니다.");

		sc.close();
		
	}

}
