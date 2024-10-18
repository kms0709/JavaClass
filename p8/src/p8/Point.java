package p8;

public class Point {
	private int x;
	private int y;
	public Point(int x,int y){
		this.x=x; this.y=y;
	}
	void disp() {
		System.out.printf("x : %2d\ty : %2d\n",x,y);
	}
}
