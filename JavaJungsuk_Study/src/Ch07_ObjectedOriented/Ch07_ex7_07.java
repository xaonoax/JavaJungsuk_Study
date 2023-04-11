package Ch07_ObjectedOriented;

public class Ch07_ex7_07 {

	public static void main(String[] args) {
//		Car car = null;
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null;
		
//		fe.water();
//		car = fe;  // car = (Car)fe;에서 형변환이 생략
//		car.water();  // 에러. Car 타입의 참조변수인 Car로는 water() 사용불가
//		fe2 = (FireEngine)car;  // 자손타입 <- 조상타입 형변환 생략 불가
//		fe2.water();
		
		Car car = null;
		FireEngine fe = new FireEngine();
		
		FireEngine fe2 = (FireEngine)car;  // 조상 -> 자손으로 형변환
		Car car2 = (Car)fe2;			   // 자손 -> 조상으로 형변환
//		car.drive();  // NullPointerException 발생
	}

}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive~");
	}
	
	void stop() {
		System.out.println("stop!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water~!");
	}
}
