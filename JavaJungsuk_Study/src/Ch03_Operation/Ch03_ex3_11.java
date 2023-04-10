package Ch03_Operation;

public class Ch03_ex3_11 {

	public static void main(String[] args) {
		// 실수를 소수점 첫 째자리에서 반올림
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shortPi);
		
		// 3.141을 얻으려면?
		System.out.println((int)(pi * 1000)/1000.0);
	}

}
