package p5;
/* 1 ~ 100 까지의 수 중 소수만 출력
 * 2 3 5 7 ...
 * 소수의 총 개수 : xx개
 * */

public class Ex1소수 {

	public static void main(String[] args) {
		for (int num = 1; num <= 100; num++)
		{
			boolean sw = false; // 나눠보기 전 초기치
			int i;
			for (i = 2; i < num; i++) // 1과 자신으로만 나눠봄
			{
				if (num % i == 0)
				{
					sw = true;
					break;
				} // if
			} // for
			
			String pan = (sw == false && num == i) ? "소수임" : "소수아님";
			System.out.println(num + " : " + pan);
		} // for (num)
		
		System.out.println("종료합니다.");
	}

}
