package Ch08_Exception;

public class Ch08_ex8_01 {

	public static void main(String[] args) {
		// 예외가 발생하지 않았을 때
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		}
		catch (Exception e){  // 예외 발생하지 않아서 실행 제외됨
			System.out.println(4);
		}  // try-catch의 끝
		System.out.println(5);
	}

}
