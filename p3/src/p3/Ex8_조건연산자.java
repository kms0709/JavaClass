/*조건연산자 == 삼항연산자
 (조건)? 참 : 거짓;
*/
package p3;

public class Ex8_조건연산자 {

	
	public static void main(String[] args) {
		int x = 5;
		int y = 3;

		/*int big;
		if(x>y)
			big = x;
		else
			big = y;
		*/
		int big=(x>y) ? x : y;
		System.out.println("두 수중 더 큰수 :"+big);

	}
	
	
}
