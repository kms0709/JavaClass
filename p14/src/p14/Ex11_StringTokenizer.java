package p14;

import java.util.StringTokenizer;

public class Ex11_StringTokenizer {

	public static void main(String[] args) 
	{
		String query = "name=kitae&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query, "&=");
		//& 또는 =

		int n = st.countTokens(); 					// 분리된 토큰 개수
		System.out.println("토큰 개수 = " + n);//6

		while(st.hasMoreTokens())
		{ 
			String token = st.nextToken(); 		// 토큰 얻기
			System.out.println(token); 				// 토큰 출력
		}

	}

}
