package Ch14_Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ch14_ex14_07 {

	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
			new String[] {"abc", "def", "jkl"},
			new String[] {"ABC", "DEF", "JKL"}
		);
		
//		Stream<String<String>> strStrmStrm = sttArrStrm.map(Arrays::stream);
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
		
		strStrm.map(String::toLowerCase)  // 스트림의 요소를 모두 소문자로 변경
			   .distinct()  // 중복제거
			   .sorted()  // 정렬
			   .forEach(System.out::println);
		System.out.println();
		
		String[] lineArr = {
			"Believe or not It is true",
			"Do or do not There is no try",
		};
		
		Stream<String> lineStream = Arrays.stream(lineArr);
		lineStream.flatMap(line -> Stream.of(line.split(" +")))
			.map(String::toLowerCase)
			.distinct()
			.sorted()
			.forEach(System.out::println);
		System.out.println();
	}

}
