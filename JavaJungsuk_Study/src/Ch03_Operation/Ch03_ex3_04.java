package Ch03_Operation;

public class Ch03_ex3_04 {

	public static void main(String[] args) {
		int i = -10;
		i = +1;
		System.out.println("i = " + i);
		
		i = 10;
		i = -1;
		System.out.println("i = " + i);
		
		// '+'는 아무 일도 하지 않는다.(실제로 사용 안 함)
		// '-'는 피연산자의 부호를 반대로 변경해준다.
	}

}
