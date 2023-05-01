package Ch14_Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ch14_ex14_00_3 {

	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//		Stream<Integer> intStream = list.stream();  // list를 stream으로 변환
//		intStream.forEach(System.out::print);  // forEach() 최종연산
		
		// stream은 1회용. stream에 대해 최종연산을 수행하면 stream이 닫힌다.
//		intStream = list.stream();  // list로부터 steam을 생성
//		intStream.forEach(System.out::print);
	
		String[] strArr = {"a", "b", "c", "d"};
//		Stream<String> strStream = Stream.of(strArr);
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.forEach(System.out::println);
		
		int[] intArr = {1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(intArr);
//		intStream.forEach(System.out::println);
//		System.out.println("count=" + intStream.count());
//		System.out.println("sum=" + intStream.sum());
		System.out.println("average=" + intStream.average());
		
//		Integer[] intArr = {1, 2, 3, 4, 5};
//		Stream<Integer> intStream = Arrays.stream(intArr);
//		intStream.forEach(System.out::println);
//		System.out.println("count=" + intStream.sum());
		
	}

}
