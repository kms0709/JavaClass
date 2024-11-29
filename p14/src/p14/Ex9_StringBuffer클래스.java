package p14;

public class Ex9_StringBuffer클래스
{

	public static void main(String[] args)
	{
		
		StringBuffer sb = new StringBuffer("This");
		sb.append(" is pencil."); 	// sb = "This is pencil."
		System.out.println("012345678901234567890123456789");
		System.out.println(sb);
		sb.insert(7, " my"); 		// sb = "This is my pencil."
		System.out.println(sb);
		sb.replace(8, 10, "your"); 	// sb = "This is your pencil."
		// 8 <=  < 10
		System.out.println(sb); 	// "This is your pencil." 출력

	}

}
