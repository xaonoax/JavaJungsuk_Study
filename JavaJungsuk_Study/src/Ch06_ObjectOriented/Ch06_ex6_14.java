package Ch06_ObjectOriented;

public class Ch06_ex6_14 {

	class Car2 {
		String color;
		String gearType;
		int door;
	
		// 생성자 this()
		// 같은 클래스 안에 있는 생성자를 호출할 때는 this를 쓴다.
		// 다른 생성자 호출시 첫 줄에서만 사용 가능
		Car2() {
			this("wihte", "auto", 4);
		}
	
		Car2(String color) {
			this("color", "auto", 4);
		}
	
		Car2(String color, String gearType, int door) {
			this.color = color;
			this.gearType = gearType;
			this.door = door;
		}
	}
}