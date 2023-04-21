package Ch10_Format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ch10_ex10_09 {

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df.parse("2023년 4월 21일");  // 문자열을 날짜로 바꿈
			System.out.println(df2.format(d));  // 날짜를 문자열로 바꿈
		}
		catch (Exception e) {}
	}

}
