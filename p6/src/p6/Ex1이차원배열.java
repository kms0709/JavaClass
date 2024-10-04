package p6;
//3장 ppt 29
public class Ex1이차원배열 {

	public static void main(String[] args) {
		int iA[][] = { { 0, 1, 2}, 
		           { 3, 4}, 
		           { 6, 7, 8} }; 	// 3x3 배열 생성
		System.out.println("iA--");
		//System.out.println("전체행의 개수		"+iA.length);
		//System.out.println("0행의 열의 개수		"+iA[0].length);
		//System.out.println("1행의 열의 개수		"+iA[1].length);
		for(int i=0;i<iA.length; i++) {
			for(int j=0;j<iA[i].length;j++) {
				System.out.printf("iA[%d][%d] : %d ",i,j,iA[i][j]);
			}
			System.out.println();
		}
	char cA[][] = { {'a', 'b', 'c'}, {'d', 'e', 'f'} };
	System.out.println("cA--");
	for(int i=0;i<cA.length; i++) {
		for(int j=0;j<cA[i].length;j++) {
			System.out.printf("cA[%d][%d] : %c ",i,j,cA[i][j]);
		}
		System.out.println();
	}
	double dA[][] = { {0.01, 0.02}, {0.03, 0.04} }; // 2x2 배열 생성
	System.out.println("dA--");
	for(int i=0;i<dA.length; i++) {
		for(int j=0;j<dA[i].length;j++) {
			System.out.printf("dA[%d][%d] : %.2f ",i,j,dA[i][j]);
		}
		System.out.println();
	}

	}

}
