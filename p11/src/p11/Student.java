package p11;

public class Student {
	   private int hno;
	   private String name;
	   
	   // getter
	   public int getHno() { return hno; }
	   public String getName() { return name; }
	   
	   // 생성자
	   public Student(int hno, String name) {
		   this.hno=hno; // 멤버변수=매개변수;
		   this.name=name;
		   
		   System.out.println("부모 인수있는 생성자");
	   }
}

class Sungjuk extends Student {
	   private int kor;
	   private int eng;
	   private int tot;
	   private float avg;
	   private char grade;
	   private int rn;
	   
	   // getter, setter
	   public void setRn(int soon) { rn=soon; }
	   public int getRn() { return rn;  }
	   public int getTot() { return tot;  }

	   // 생성자
	   public Sungjuk(int hno, String name, int kor, int eng) {
		   super(hno, name);
		   this.kor=kor;
		   this.eng=eng;
		   
		   System.out.println("자녀 인수있는 생성자");
	   }
	   
	   // 함수
	   public void calc() {
		   tot = kor+eng;
		   avg = (float)tot/2; // == avg = tot / 2.0F;
		   switch( (int)avg/10 ) // (int)97.5F --> 97,97/10 --> 9
		   {
		   case 10:
		   case 9:grade='A';break;
		   case 8:grade='B';break;
		   case 7:grade='C';break;
		   case 6:grade='D';break;
		   default:grade='F';break;
		   }
	   }
	   
	   public void disp1() {
		   System.out.printf("%3d\t%s\t%3d\t%3d\t", getHno(), getName(), kor, eng);
	   }
	   
	   public void disp2() {
		   System.out.printf("%3d\t%5.1f\t%3c\t%3d\n", tot, avg, grade, rn);
	   }
	}