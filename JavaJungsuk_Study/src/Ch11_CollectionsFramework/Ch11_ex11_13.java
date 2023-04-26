package Ch11_CollectionsFramework;

import java.util.Set;
import java.util.TreeSet;

public class Ch11_ex11_13 {

	public static void main(String[] args) {
		Set set = new TreeSet();  // 범위 검색, 정렬. 따로 정렬할 필요 없음
		
		for (int i=0; set.size()<6; i++) {
			int num = (int)(Math.random() * 45) + 1;
			set.add(num);  // set.add(new Integer(num));
		}
		
		System.out.println(set);
	}

}
