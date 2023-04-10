package Ch04_CtrlStatement;

public class Ch04_ex4_10 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=5; i++) {
			sum += 1;  // sum = sum + i;
			System.out.printf("1부터 %2d 까지의 합 : %2d%n", i, i);
		}
		
	}

}
