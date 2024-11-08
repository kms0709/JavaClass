package p10;

public class Sample {
	int id;
	public Sample(int id) {this.id=id;}
	public static void main(String[] args) {
		Sample ob1=new Sample(3);
		Sample ob2=new Sample(4);
		Sample s;
		
		s=ob2;
		ob1=ob2;
		
	}

}
