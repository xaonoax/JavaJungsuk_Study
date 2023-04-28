package Ch12_Generics;

import java.util.ArrayList;

public class Ch12_ex12_GenericTest {

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();  // Integer만 저장할 수 있게 함
//		ArrayList list = new ArrayList();  // 지네릭스 도입 이전
		ArrayList<Object> list = new ArrayList<Object>();  // 여러종류의 객체를 저장할때, 지네릭스 도입 이후 이렇게 씀
		list.add(10);
		list.add(20);
		list.add("30");  // String을 추가
//		list.add(30);  // 지네릭스 덕분에 타입 체크가 강화됨
		
//		Integer i = (Integer)list.get(2);  // 컴파일 OK, 실행하면 형변환 에러 발생
		String i = (String)list.get(2);  // 형변환 생략 가능
		
		System.out.println(list);
	}

}
