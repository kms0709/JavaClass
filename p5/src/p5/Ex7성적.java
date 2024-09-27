package p5;
/*
3명의 기본자료를 입력하여 배열변수에 할당후, 아래처럼!
#1)
	이름? 이이
	국어, 영어?? 100 95
#2)
	이름? 홍 길 동
	....
	
  *성적결과*
이름	국어	영어
xxx xxx xxx
...
 */

import java.util.Scanner;

public class Ex7성적 {
	
	static final int SI = 5; //final상수
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner tc = new Scanner(System.in);
		String name[] = new String[SI];
		int kor[] = new int[SI];
		int eng[] = new int[SI];
		
		for(int i = 0 ; i < SI ; i++)
		{
			//사용자 입력
			System.out.print("이름? ");
			name[i] = sc.nextLine(); // 이름
			
			System.out.print("국어, 영어?? ");
			kor[i] = tc.nextInt(); // 국어
			eng[i] = tc.nextInt(); // 영어
		}
		
		System.out.println("\t*성적결과*");
		System.out.println("이름\t국어\t영어");
		
		for(int i = 0 ; i < SI ; i++)
		{
			System.out.printf("%s\t%3d\t%3d\n",name[i],kor[i],eng[i]);
		}
		
		tc.close();
		sc.close();
		
	}

}
