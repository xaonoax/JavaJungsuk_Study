package Ch08_Exception;

public class Ch08_ex8_02 {

	public static void main(String[] args) {
		// 예외가 발생했을 때
		System.out.println(1);
		try {
			System.out.println(0/0);  // 예외 발생
			System.out.println(3);  // 예외 발생 이후 문장 실행 안 함
		}
		catch (ArithmeticException ae){
			System.out.println(3);
		}  // try-catch의 끝
		System.out.println(4);
	}

}
