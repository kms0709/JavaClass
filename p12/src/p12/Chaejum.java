package p12;
class StudentInf {
	private int hno;
	private String name;
	//public StudentInf() {}
	
	public StudentInf(int hno,String name ) {
		this.hno = hno;
		this.name = name;
		//System.out.println("부모 인수있는 생성자\n");
	}
	
	public int getHno() { return hno; }
	public void showHnoName() {
		System.out.printf("%3d\t%s\t",hno,name);
	}
}

public class Chaejum extends StudentInf {
	static int jdap[] = {1,2,3,4,1};
	private int sdap[] = new int[5];
	private char ox[] = new char[5];
	private int tot;
	private int rn;
	
	public Chaejum(int hno,String name,int sdap[]) {
		super(hno,name);
		for(int i=0;i<sdap.length;i++) {
			this.sdap[i]=sdap[i];
		} // for
		//System.out.println("자녀 인수있는 생성자\n");
	}
	
	
	public void calc() {
		// 채점하기
		for (int i = 0; i < sdap.length; i++) {
			if (sdap[i] == jdap[i]) {
				ox[i] = 'o'; tot += 20;
			}
			else
				ox[i] = 'x';
		} // for
	}
	
	public void showSdap() {
		for(int i=0;i<sdap.length;i++) {
			System.out.printf("%2d ",sdap[i]);
		} // for
		System.out.printf("\n");
	}
	
	public void showOx() {
		
	}
}

