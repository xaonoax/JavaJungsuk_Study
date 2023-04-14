package Ch08_Exception;

public class Ch08_ex8_ex04 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);  // 예외 발생 전이라 출력됨
			System.out.println(0/0);  // 고의로 ArithmeticException 발생
			System.out.println(4);
		}
		catch (ArithmeticException ae) {
			System.out.println("true");
		System.out.println("ArithmeticException");
		}
		catch (Exception e) {  // ArithmeticException을 제외한 모든 예외가 처리됨 Exception = 모든 예외 최고 조상
			System.out.println("Exception");
		}
		System.out.println(6);
	}

}
