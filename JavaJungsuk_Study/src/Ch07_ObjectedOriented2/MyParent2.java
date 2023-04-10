package Ch07_ObjectedOriented2;

import Ch07_ObjectedOriented.Ch07_ex7_MyParent;

class MyChild extends Ch07_ex7_MyParent {
	public void printMembers() {
//		System.out.println(prv);  // 에러
//		System.out.println(dft);  // 에러
		System.out.println(prt);  // OK
		System.out.println(pub);  // OK
	}
}

public class MyParent2 {

	public static void main(String[] args) {
		Ch07_ex7_MyParent p = new Ch07_ex7_MyParent();
//		System.out.println(p.prv);  // 에러
//		System.out.println(p.dft);  // 에러
//		System.out.println(p.prt);  // 에러
		System.out.println(p.pub);  // OK
	}

}
