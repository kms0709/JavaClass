package p6;/*
3명의 기본자료를 입력하여 배열변수에 할당후, 아래처럼!

#1)
	이름? 이이
	국어, 영어?? 100 95
#2)
	이름? 홍 길 동
	....
	
  *성적결과*
이름	국어	영어 총점   평가 등수
xxx xxx xxx xx.x  x  x
...
 */

import java.util.Scanner;

public class Ex2_성적_이차원배열 {
	static final int SI = 5; //final상수
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner tc = new Scanner(System.in);
		String name[] = new String[SI];
		int a[][] = new int[SI][4];
		double ave[]=new double[SI];
		char grade[]=new char[SI];
		for(int i = 0 ; i < SI ; i++)
		{
			System.out.printf("#%d)\n",i+1);
			//사용자 입력
			System.out.print("이름? ");name[i]=sc.nextLine();
			name[i] = sc.nextLine(); // 이름
			
			System.out.print("국어, 영어?? ");
			a[i][0] = tc.nextInt(); // 국어
			a[i][1] = tc.nextInt(); // 영어
			a[i][2] = a[i][0]+a[i][1];
			ave[i]=(double)a[i][2]/2;
			//==ave[i]=(double)a[i][2]/2.0;
			switch((int)ave[i] / 10 )//(int) 99.5 --> 99
			{
			case 10:
			case 9:grade[i]='A';break;
			case 8:grade[i]='B';break;
			case 7:grade[i]='C';break;
			case 6:grade[i]='D';break;
			default:grade[i]='F';break;
			}
			
			
			/*for(int k=0; k < tot.length; k++) // i가 기준
			{
				rn[k]=1; // 비교전 1등
				for(int j = 1; j < tot.length; j++)
				{
					//if(i==j) continue;
					if(tot[k] < tot[j]) rn[k]++;
				} // for j
			} // for i
		}
		*/
		}
		System.out.println("\t*성적결과*");
		System.out.println("이름\t국어\t영어\t총점\t평군\t평가\t등수");
		
		for(int i=0;i<SI;i++){
			System.out.printf("%s\t%",name[i]);
			for(int j=0;j<a[i].length-1 ;j++) {
				System.out.printf("3d\t",a[i][j]);
					
		}
			System.out.printf("%5.1f\t%3c\t%3d\n",
					ave[i], grade[i],a[i][3]);
		}
		tc.close();
		sc.close();
		
	}

}

