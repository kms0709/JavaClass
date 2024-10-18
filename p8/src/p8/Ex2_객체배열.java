package p8;/*
x : 0   y : 0
x : 3   y : 5
x : 6   y : 10
x : 9   y : 15
x : 12  y : 20
*/

public class Ex2_객체배열 {

	public static void main(String[] args) {
		Point p[]=new Point[5];
		for(int i=0;i<p.length;i++) {
			p[i]=new Point(i*3,i*5);
		}
		for(int i=0;i<p.length;i++) {
			p[i].disp();
		}
	}
}
