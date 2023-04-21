package Ch10_DateTime;

import java.util.Calendar;

public class Ch10_ex10_04 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2019, 7, 31);  // 2019년 8월 31일
		
		System.out.println(toString(date));
		System.out.print("1일 후(add) = ");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.print("6달 전(add) = ");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		// roll()은 다른 필드에 영향을 주지 않는다.
		System.out.print("31일 후(roll) = ");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		System.out.print("31일 후(add) = ");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 "
			   + (date.get(Calendar.MONTH) + 1) + "월 "
			   + date.get(Calendar.DATE) + "일";
	}

}
