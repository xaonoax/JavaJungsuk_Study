package Ch12_Annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
@SuppressWarnings("1111")  // 유효하지 않은 애너테이션은 무시됨
@TestInfo(testedBy = "aaa", testDate=@DateTime(yymmdd="160101", hhmmss="235959"))
class Ch12_ex12_08 {

	public static void main(String[] args) {
		// Ch12_ex12_08의 Class 객체를 얻음
		Class<Ch12_ex12_08> cls = Ch12_ex12_08.class;
		
		TestInfo anno = cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy()=" + anno.testedBy());
		System.out.println("anno.testDate().yymmdd()=" + anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss()=" + anno.testDate().hhmmss());
		
		for (String str : anno.testTools())
			System.out.println("testTools=" + str);
		
		System.out.println();
		
		// Ch12_ex12_08에 적용된 모든 애너테이션을 가져옴
		Annotation[] annoArr = cls.getAnnotations();
		
		for (Annotation a : annoArr)
			System.out.println(a);
	}

}

@Retention(RetentionPolicy.RUNTIME)  // 실행시에 사용가능하도록 지정
@interface TestInfo {
	int count() default 1;
	String testedBy();
	String[] testTools() default "JUnit";
	TestType testType() default TestType.FIRST;
	DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME)  // 실행시에 사용가능하도록 지정
@interface DateTime {
	String yymmdd();
	String hhmmss();
}
enum TestType {FIRST, FIANL}