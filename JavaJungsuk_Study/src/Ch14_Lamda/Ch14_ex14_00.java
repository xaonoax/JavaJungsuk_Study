package Ch14_Lamda;

public class Ch14_ex14_00 {

	public static void main(String[] args) {
//		Object obj = (a, b) -> a > b ? a : b;  // 람다식 익명객체
//		MyFuncton2 f = new MyFuncton2() {
//			public int max(int a, int b) {  // 오버라이딩 : 접근제어자는 좁게 바꾸지 못한다.
//				return a > b ? a : b;
//			}
//		};
		// 람다식(익명 객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
		MyFuncton2 f = (a, b) -> a > b ? a : b;
		
		int value = f.max(3, 5);  // 함수형 인터페이스
		System.out.println("value=" + value);
	}

}

@FunctionalInterface  // 함수형 인터체이시는 단 하나의 추상 메서드만 가져야 함
interface MyFuncton2 {
//	public abstract int max(int a, int b);
	int max(int a, int b);
}