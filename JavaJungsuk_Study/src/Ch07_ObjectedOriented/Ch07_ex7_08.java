package Ch07_ObjectedOriented;

public class Ch07_ex7_08 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		Product p = new Tv1();
		b.buy(p);
//		b.buy(new Tv1());  // 위 두 문장과 동일
		b.buy(new Computer());
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 포인트는 " + b.point + "점입니다.");
	}

}

class Product {
	int price;  // 제품의 가격
	int point;  // 제품 구매시 제공하는 포인트점수
	
	Product(int price) {
		this.price = price;
		this.point = (int)(price/10.0);  // 보너스 점수는 제품 가격의 10%
	}
}
class Tv1 extends Product {
	Tv1() {
		// 조상클래스의 생성자 Product(int price)를 호출.
		super(100);  // Tv 가격은 100만원
	}
	
	// Object클래스의 toString()을 오버라이딩.
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);  // 컴퓨터 가격은 200만원
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyer {  // 고객
	int money = 1000;  // 보유 금액
	int point = 0;     // 보유 포인트
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		money -= p.price;   // 가진 돈에서 구입한 제품의 가격을 뺌
		point += p.point;   // 포인트 점수를 추가
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
}
