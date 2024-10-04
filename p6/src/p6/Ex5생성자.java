package p6;

public class Ex5생성자 {

	public static void main(String[] args) {
		Sinsang p = new Sinsang("홍 길 동",20,75.5);
		System.out.println("p----");
		p.disp();
		
		Sinsang r = new Sinsang();
		System.out.println("r----");
		r.disp();

	}

}
