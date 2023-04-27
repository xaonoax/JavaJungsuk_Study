package Ch11_CollectionsFramework;

import java.util.HashMap;
import java.util.Scanner;

public class Ch11_ex11_16 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId",  "1234");
		map.put("asdf",  "1111");
		map.put("asdf",  "1234");  // 값이 다른 경우에는 마지막 값으로 변경 됨
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.println("id : ");
			String id = sc.nextLine().trim();  // 입력된 공백 제거
			
			System.out.println("password : ");
			String password = sc.nextLine().trim();  // 입력된 공백 제거
			System.out.println();
			
			if (!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}
			
			if (map.equals(password)) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				continue;
			}
			
			else {
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			}
		}
	}

}
