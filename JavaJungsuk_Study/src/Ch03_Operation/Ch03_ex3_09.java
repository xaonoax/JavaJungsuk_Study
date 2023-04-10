package Ch03_Operation;

public class Ch03_ex3_09 {

	public static void main(String[] args) {
		int a = 1_000_000;  // 1백만
		int b = 2_000_000;  // 2백만
		
		long c = a * b;     // a * b = 2조
		// 오버플로우 발생
		// a * b의 결과 값이 int 범위를 넘어감 
		System.out.println(c);
		
		long d = (long)a * b;
		// long으로 형변환함
		System.out.println(d);
		
	}

}
