package Ch06_ObjectOriented;

public class Ch06_ex6_03 {

	public static void main(String[] args) {
		// cv는 객체 생성 없이 사용 가능
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "♥";
		c1.number = 5;
		
		Card c2 = new Card();
		c2.kind = "♠";
		c2.number = 7;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		Card.width = 50;
		Card.height = 80;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
		
		// cv를 참조 변수 c1을 사용해 값을 변경해도 공통 속성이기 때문에 c1, c2 둘 다 바뀐다.
	}

}

class Card {
	String kind;  // 무늬
	int number;   // 숫자
	
	// cv(공통 속성)
	static int width = 100;   // 폭
	static int height = 250;  // 높이
}
