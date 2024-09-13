package p2;

public class Ex3문자열
{

	public static void main(String[] args)
	{
		String toolname = "JDK";
		String love = " 사랑해!!";
		System.out.println(toolname + love);
		System.out.println(toolname + 1.8);
		//-> JDK1.8
		System.out.println("(" + 3 + "," + 5 + ")");
		// (3,5)
		System.out.println(toolname + "1.8이 출시됨");
		System.out.println(toolname + 1.8 + "이 출시됨");
		// "JDK1.8이 출시됨" 출력
		//int price = 3.5; //자바는 error! c는 3이할당
		//int price = 2147483647;
		long price = 2147483648L;
		
		System.out.println("price : " + price);
		

	}

}
