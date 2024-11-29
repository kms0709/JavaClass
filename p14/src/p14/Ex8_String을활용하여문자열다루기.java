package p14;

public class Ex8_String을활용하여문자열다루기
{

	public static void main(String[] args)
	{
		String a = new String(" C#");
		String b = new String(",C++ ");

		System.out.println(a + "의 길이는 " + a.length()); 
		// 문자열의 길이(문자 개수)
		System.out.println(a.contains("#")); 
		// 문자열의 포함 관계 true

		a = a.concat(b); 
		// 문자열 연결 "C# , C++"
		System.out.println(a);
		System.out.println(a.length());

		a = a.trim(); 
		// 문자열 앞 뒤의 공백 제거
		System.out.println(a);
		System.out.println(a.length());
		
		System.out.println("-------------------");
		
		a = a.replace("C#","Java"); 
		// 문자열 대치
		System.out.println(a);
		

		String s[] = a.split(","); 
		// 문자열 분리
		//s[0] = "Java" , s[1] = "C++"
		for (int i=0; i<s.length; i++)
			System.out.println("분리된 문자열" + i + ": " + s[i]);
		
		//a = "Java , C++"; 상태
		a = a.substring(5); 
		// 인덱스 5부터 끝까지 서브 스트링 리턴
		System.out.println(a);
		char c1 = a.charAt(0); 
		char c2 = a.charAt(1); 
		char c3 = a.charAt(2); 
		// 인덱스 2의 문자 리턴
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
