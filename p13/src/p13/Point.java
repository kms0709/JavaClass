package p13;

public class Point
{
	private int x, y;
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
	
	public boolean equals(Object obj) { // 업캐스팅
		Point p = (Point)obj; // obj를 Point 타입으로 다운 캐스팅
		
		if(x == p.x && y == p.y)
			return true;
		else
			return false;
	}

}
