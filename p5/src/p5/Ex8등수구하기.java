package p5;
/*
 점수 등수
 ----------------
 185 3
 200 1
 195 2
 175 4
 160 5
 */

public class Ex8등수구하기 {

	public static void main(String[] args) {
		int a[]= {185,200,195,175,160};
		int rn[]=new int[a.length];
		String line="----------------";
		//등수구하기
		for(int i=0; i < a.length; i++) // i가 기준
		{
			rn[i]=1; // 비교전 1등
			for(int j = 1; j < a.length; j++)
			{
				//if(i==j) continue;
				if(a[i] < a[j]) rn[i]++;
			} // for j
		} // for i
		System.out.println("점수\t등수");
		System.out.println(line);
		for(int i = 0 ; i < a.length; i++) {
			System.out.printf("%3d\t%3d\n",a[i],rn[i]);
		}
	}

}
