package Ch07_ObjectedOriented;

public class Ch07_ex7_04 {

	public static void main(String[] args) {
		Point3D p3 = new Point3D(1, 2, 3);
	}

}

class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		// 조상의 생성자 Point(int x, int y)를 호출
		super(x, y);  // 생성자 꼭 생성하기
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {  // 오버라이딩
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
}