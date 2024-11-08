package p10;
/*
 This is a pencil.
 This,is,a,pencil.
*/

public class ArrayParameter {
	static void printCharArray(char ch[]) {
		for (int i=0; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
	}
	static void replaceSpace(char ch[]) {
		for (int i=0; i<ch.length; i++) {
			if(ch[i]==' ') ch[i]=',';
		}
		
	}
	public static void main (String args[]) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}
}
