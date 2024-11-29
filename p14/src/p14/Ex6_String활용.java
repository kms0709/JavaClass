package p14;
//레퍼런스의 비교

public class Ex6_String활용 {

	public static void main(String[] args) {
		String java = "Java";
		String hello ="Hello";
		String ss = "Java";
		
		if(java == hello)
			System.out.println("같음.");
		else
			System.out.println("다름.");
		
		if(java == ss)
			System.out.println("같음.");
		else
			System.out.println("다름.");
		
		if(java.equals("Java"))
			System.out.println("같은 문자열");
		else
			System.out.println("다른 문자열");
		
		if(hello.equals("Java"))
			System.out.println("다른 문자열");
		else
			System.out.println("다른 문자열");
		

	}

}
