package p5;

public class Ex5_레퍼런스의치환과_배열공유 {

	public static void main(String[] args) {
		//ppt21
		int ia[] = {10,20,30,40,50};
		int myArray[] = ia;//레퍼런스의 치환
		
		System.out.println("원래ia---");
		for(int i =0; i<ia.length ; i++)
		{
			System.out.printf("ia[%d] : %d\n",i,ia[i]);
		}
		
		myArray[3] = 999;
		
		System.out.println("13처리후 ia---");
		for(int i =0; i<ia.length ; i++)
		{
			System.out.printf("ia[%d] : %d\n",i,ia[i]);
		}
		
		System.out.println("myArray---");
		for(int i =0; i<myArray.length ; i++)
		{
			System.out.printf("myArray[%d] : %d\n",i,myArray[i]);
		}

	}

}
