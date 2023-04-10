package Ch07_ObjectedOriented;

public class Ch07_ex7_03 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}

}

class Parent2 { int x = 10; }  // super.x와 this.x 둘 다 가능

class Child2 extends Parent {
	void method() {
		System.out.println("x=" + x);  // 조상 x
		System.out.println("this.x=" + this.x);  // 조상 x
		System.out.println("super.x=" + super.x);
		
		// 조상 멤버이면서 내 멤버이기 때문에 super.x인 동시에 this.x
		
	}
}