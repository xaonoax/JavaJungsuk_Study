package Ch07_ObjectedOriented;

public class Ch07_ex7_MyParent {
	private	  int prv;  // 같은 클래스
			  int dft;  // 접근 제어자에 아무 것도 안 붙이면 (default) 같은 패키지
	protected int prt;  // 같은 패키지 + 자손(다른 패키지)
	public    int pub;  // 접근제한 없음
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

class MyParentTest {  // 접근 제어자 (default)

	public static void main(String[] args) {
		Ch07_ex7_MyParent p = new Ch07_ex7_MyParent();
//		System.out.println(p.prv);  // 에러, 같은 클래스가 아님
		System.out.println(p.dft);  // OK
		System.out.println(p.prt);  // OK
		System.out.println(p.pub);  // OK
	}

}
