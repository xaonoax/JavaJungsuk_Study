package Ch04_CtrlStatement;

import java.util.Scanner;

public class Ch04_ex4_04 {

	public static void main(String[] args) {
		int score = 0;     // 점수를 저장하기 위한 변수
		char grade = ' ';  // 학점을 저장하기 위한 변수(공백으로 초기화)
		
		System.out.print("점수를 입력하세요. >");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();  // 화면을 통해 입력은 점수를 score에 저장
		
		if (score >= 90) {       // score가 90점과 같거나 크면 A학점
			grade = 'A';
		}
		else if (score >= 80) {  // score가 80점과 같거나 크면 B학점
			grade = 'B';
		}
		else if (score >= 70) {  // score가 70점과 같거나 크면 C학점
			grade = 'c';
		}
		else {                   // 나머지는 D학점
			grade = 'D';
		}
		
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}

}
