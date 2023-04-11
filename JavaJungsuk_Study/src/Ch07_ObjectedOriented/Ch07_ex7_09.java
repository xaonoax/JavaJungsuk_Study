package Ch07_ObjectedOriented;

public class Ch07_ex7_09 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
	}

}

class Product2 {
	int price;  // 제품의 가격
	int point;  // 제품 구매시 제공하는 포인트점수
	
	Product2(int price) {
		this.price = price;
		this.point = (int)(price/10.0);  // 보너스 점수는 제품 가격의 10%
	}
	
	Product2() {}  // 기본 생성자
}
class Tv2 extends Product2 {
	Tv2() {
		super(100);  // Tv 가격은 100만원
	}
	
	// Object클래스의 toString()을 오버라이딩.
	public String toString() {
		return "Tv";
	}
}

class Computer2 extends Product2 {
	Computer2() {
		super(200);  // 컴퓨터 가격은 200만원
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio2 extends Product2 {
	Audio2() {
		super(50);  // 오디오 가격은 50만원
	}
	
	public String toString() {
		return "Audio";
	}
}

class Buyer2 {  // 고객
	int money = 1000;  // 보유 금액
	int point = 0;     // 보유 포인트
	Product2[] cart = new Product2[10];  // 구입한 제품을 저장하기 위한 배열
	int i = 0;         // Product 배열에 사용될 카운터
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		money -= p.price;   // 가진 돈에서 구입한 제품의 가격을 뺌
		point += p.point;   // 포인트 점수를 추가
		cart[i++] = p;      // 제품을 Product[] cart에 저장
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void summary() {           // 구매한 물품에 대한 정보를 요약해서 보여준다.
		int sum = 0;           // 구입한 물품의 가격합계
		String itemList = "";  // 구입한 물품목록
		
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만듦.
		for(int i=0; i<cart.length; i++) {
			if(cart[i] == null) break;
			sum += cart[i].price;
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}
