package Ch14_Lamda;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ch14_ex14_00_2 {
	public static void main(String[] args) {
//		Function<String, Integer> f = (String s) -> Integer.parseInt(s);
		
		// 메서드 참조로 바꾸기
//		Function<String, Integer> f = 클래스이름::메서드이름;
		Function<String, Integer> f = Integer::parseInt;  // 어려우면 공부할 때 람다식으로 바꿔보기
		
		System.out.println(f.apply("100") + 200);
		
		// Supplier는 입력 X, 출력O
//		Supplier<MyClass> s = () -> new MyClass();
		Supplier<MyClass> s = MyClass::new;  // 메서드 참조
		
		MyClass mc = s.get();
		System.out.println(mc);
		System.out.println(s.get());
		
		// 배열
//		Function<Integer, int[]> f2 = (i) -> new int[i];
		Function<Integer, int[]> f2 = int[]::new;  // 메서드 참조
		int[] arr = f2.apply(100);
		
		System.out.println("arr.length=" + arr.length);
;	}
}

class MyClass{}