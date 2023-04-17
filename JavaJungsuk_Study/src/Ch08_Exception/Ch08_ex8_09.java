package Ch08_Exception;

public class Ch08_ex8_09 {
	// 메서드에 예외 선언
	public static void main(String[] args) throws Exception{
		method1();  // 같은 클래스내의 static멤버이므로 객체생성없이 직접 호출이 가능하다.
	}
			
	static void method1() throws Exception {
		method2();
	}
			
	static void method2() throws Exception {
		throw new Exception();
	}

}
