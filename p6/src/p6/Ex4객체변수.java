package p6;

public class Ex4객체변수 {

	public static void main(String[] args) {
		Sinsang p=new Sinsang();
		p.setData("홍 길 동",20,75.5);
      
	}

}
class Sinsang{
	private String name;
	private int age;
	private double weight;
	public Sinsang(){ System.out.println("생성자call~"); }
	public void setData(String _name,int _age,double _weight){
		name=_name;
		age=_age;
		weight=_weight;
	}
}