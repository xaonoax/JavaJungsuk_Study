package Ch05_Array;

import java.util.Arrays;

public class Ch05_ex5 {

	public static void main(String[] args) {
//		int[] score;         // 1. 배열 score를 선언(참조변수)
//		score = new int[5];  // 2. 배열의 생성(int의 저장공간 x5)
	
		int[] score = new int[5];  // 배열의 선언과 생성을 동시에 함
		score[3] = 100;            // 인덱스 3번에 100을 저장
		
		System.out.println("score[0]=" + score[0]);
		System.out.println("score[1]=" + score[1]);
		System.out.println("score[2]=" + score[2]);
		System.out.println("score[3]=" + score[3]);
		System.out.println("score[4]=" + score[4]);
		
		int value = score[3];  // 배열 인덱스 3번의 값을 변수에 저장
		System.out.println("value=" + value);
		
		System.out.println();
	
		int[] arr = new int[5];  // 길이가 5인 배열 arr을 생성
		System.out.println("arr.length=" + arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "]" + arr[i]);
		}
		
		System.out.println();
		
		int[] iArr = {100, 95, 80, 70, 60};
		for (int i=0; i<iArr.length; i++) {
		System.out.println(iArr[i]);
		}
		
		System.out.println(Arrays.toString(iArr));
	}

}
