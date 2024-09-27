package p5; /* break 레이블명
break AA; : 바깥 반복문을 벗어나게 함
	1) 레이블명은 바깥 반복문 바로 위에 붙임!
*/
public class Ex3_break_레이블 {
	public static void main(String[] args) {
		AA:
		for(int i=1; i <= 3; i++) {
			for(int j=10; j<=14; j++) {
				System.out.printf("i : %d\t j : %d\n",i,j);
				if(i == 2 && j == 13) break AA;//C의 goto 역할
			}//for j
			System.out.println();
		}//for i
		System.out.println("종료합니다.");
	}

}
