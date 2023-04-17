package Ch08_Exception;

public class Ch08_ex8_06 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시킴");
			throw e;  // 예외를 발생시킹
//			throw new Exception("고의로 발생시킴")  // 위 두 줄을 한 줄로 작성 할 수 있음
		}
		catch (Exception e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료됨");
	}

}
