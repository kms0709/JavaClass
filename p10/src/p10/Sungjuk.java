package p10;
public class Sungjuk {
	private int hno;
	private String name;
	private int kor;
	private int eng;
	private int tot;
	private float avg;
	private char grade;
	private int rn;
	
	public Sungjuk(int hno, String name, int kor, int eng) {
		this.hno = hno; // 멤버변수 = 매개변수;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public void disp() {
		System.out.printf("%3d\t%s\t%3d\t%3d\n", hno, name, kor, eng);
	}
}
