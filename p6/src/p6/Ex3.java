package p6;/*
11 12 13
14 15
16 17 18 19
20
*/
public class Ex3 {
	public static void main(String[] args) {
		int a[][]=new int[4][];
		a[0]=new int[3];
		a[1]=new int[2];
		a[2]=new int[4];
		a[3]=new int[1];
		int k=10;
		for(int i=0;i<a.length  ;i++) {
			for(int j=0;j<a[i].length;j++) {
				k++;
				a[i][j]=k;
			}
		}
		for(int i=0;i<a.length  ;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("a[%d][%d] : %d ",i,j,
						a[i][j]);	
			}
			System.out.printf("\n");	
	  }
	}

}