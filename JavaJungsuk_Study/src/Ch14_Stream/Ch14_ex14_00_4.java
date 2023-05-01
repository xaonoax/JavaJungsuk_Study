package Ch14_Stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ch14_ex14_00_4 {

	public static void main(String[] args) {
//		IntStream intStream = new Random().ints();  // 무한스트림
//		IntStream intStream = new Random().ints(5, 10);  // 범위를 줄 수 있음
//		intStream
//		.limit(5)  // 5개만 자르기
//		.forEach(System.out::println);
		
		// iterate(T seed, UnaryOperator f) 단항 연산자
		Stream<Integer> intStream = Stream.iterate(1, n -> n + 2);
		intStream.limit(10).forEach(System.out::println);
		
		// generate(Supplier s) : 주기만 하는 것 입력X, 출력O
		Stream<Integer> oneStream = Stream.generate(() -> 1);
		oneStream.limit(10).forEach(System.out::println);
	}
}
