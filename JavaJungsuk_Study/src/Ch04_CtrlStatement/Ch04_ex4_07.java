package Ch04_CtrlStatement;

public class Ch04_ex4_07 {

	public static void main(String[] args) {
		int num = 0;
		
		// 괄호 안의 내용을 20번 반복
		// 1~10 사이의 난수를 20개 출력하기
		for (int i=1; i<=20; i++) {
//			System.out.println(Math.random());  // 0.0 <= x < 1.0
//			System.out.println(Math.random() * 10);  // 0.0 <= x < 10.0
//			System.out.println((int)(Math.random() * 10));  // 0 <= x < 10, 0~9
			System.out.println((int)(Math.random() * 10) + 1);  // 0 <= x < 11, 0~10
			
			// -5~5 사이의 난수를 20개 출력하기
			System.out.println((int)(Math.random() * 11) - 5);
		}
	}

}
