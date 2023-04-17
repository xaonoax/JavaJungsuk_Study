package Ch08_Exception;

public class Ch08_ex8_08 {

	public static void main(String[] args) {
		// unchecked예외
		// RuntimeException과 그 자손은 예외처리를 해주지 않아도 컴파일이 됨(선택)
		// 컴파일 ok
		throw new RuntimeException();  // RuntimeException을 고의로 발생시킴
	}
	
}
