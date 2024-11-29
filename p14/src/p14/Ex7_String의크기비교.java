package p14;

public class Ex7_String의크기비교
{

	public static void main(String[] args)
	{
		String java= "Java";
		//String cpp = "C++";
		String cpp = "Python";
		//int res = java.compareTo(cpp);
		int res = java.compareTo(cpp);
		
		System.out.print("res : "+res+"\t\n");
		
		if(res == 0) System.out.println("the same");
		else if(res < 0) System.out.println(java + " < " + cpp);
		else System.out.println(java + " > " + cpp);
	}

}
