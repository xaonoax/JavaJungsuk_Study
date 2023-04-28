package Ch12_Annotation;

public class Ch12_ex12_07 {
	
	@SuppressWarnings("deprecation")  // 컴파일러의 경고메시지가 나타나지 않게 억제한다.
									  // 괄호()안에 억제하고자하는 경고의 종류를 문자열로 지정
	public static void main(String[] args) {
		Child c = new Child();
		c.parentmethod();  // deprecated된 메서드 사용
	}

}

class Parent {
	void parentMethod() { }
}

class Child extends Parent {
//	@Override  // 오버라이딩을 올바르게 했는지 컴파일러가 체크하게 함
	@Deprecated  // 앞으로 사용하지 않을 것을 권장하는 필드나 메서드에 붙임
	void parentmethod() { }  // 조상 메서드의 이름을 잘못 적음
}

//@FunctionalInterface  // 함수형 인터페이스에 붙이면 컴파일러가 올바르게 작성했는지 체크
interface Testable {  // 함수형 인터페이스는 하나의 추상메서드만 가능
	void test();  // 추상메서드
	void check();  // 추상메서드
}