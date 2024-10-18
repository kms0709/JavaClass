package p6;

import java.util.Random;

public class Ex8난수 {

	public static void main(String[] args) {
		Random r = new Random();
		for(int i = 1 ; i <= 5; i++)
		{
			int a = r.nextInt(100); //0~99
			System.out.println("a : "+a);
		}
	}

}
