package p6;

class Sinsang{
	private String name;
	private int age;
	private double weight;
	
	public Sinsang(){ System.out.println("생성자call~"); }
	public void setData(String _name,int _age,double _weight) {
		name = _name;
		age = _age;
		weight = _weight;
	}
	
	public void disp() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("체중 : " + weight);
	}
}

public class Ex4객체변수 {

	public static void main(String[] args) {
		Sinsang p = new Sinsang();
		p.setData("홍 길 동",20,75.5);
		p.disp();
		
	}
}
