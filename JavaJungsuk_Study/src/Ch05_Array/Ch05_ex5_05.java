package Ch05_Array;

public class Ch05_ex5_05 {

	public static void main(String[] args) {
		// index : 0~45-1, 
		int[] ball = new int[45];  // 45개의 정수값을 저장하기
		
		// 배열의 각 요소에 1~45의 값을 저장
		for (int i=0; i<ball.length; i++)
			ball[i] = i + 1;  // ball[0]에 1이 저장됨
			
		int tmp = 0;  // 두 값을 바꾸는데 사용할 임시변수
		int j = 0;  // 임의의 값을 얻어 저장할 변수
		
		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔 값을 저장
		// 0~5번째 요소까지 모두 6개만 바꿈
		for (int i=0; i<6; i++) {
			j = (int)(Math.random() * 45);  // 0~44범위의 임의의 수
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		
		// 배열 ball의 앞에서부터 6개의 요소를 출력
		for (int i=0; i<6; i++)
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		
	}

}
