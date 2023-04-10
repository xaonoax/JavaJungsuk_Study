package Ch03_Operation;

public class Ch03_ex3_02 {
	
	public static void main(String args[]) {
		int i = 5, j = 0;
		
		j = i++;  // 후위형
		System.out.println("j = i++; 실행 후 : i = " + i + ", j = " + j);
		
		i = 5;
		j = 0;
		
		j = ++i;  // 전위형
		System.out.println("j = ++i; 실행 후 : i = " + i + ", j = " + j);
		
		// 증감 연산은 단독으로 사용했을 때는 차이가 없음
	}

}
