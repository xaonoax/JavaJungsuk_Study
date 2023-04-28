package Ch12_Generics;

import java.util.ArrayList;

public class Ch12_ex12_01 {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
//		ArrayList<Product> tvList = new ArrayList<Tv>();  // 에러
//		List<Tv> tvList = new ArrayList<Tv>();  // OK, 다형성
		
		productList.add(new Tv2());  // public boolean add(Product e) Product와 그 자손은 OK
		productList.add(new Audio2());
		
		tvList.add(new Tv());  // public boolean add(Tv e) Tv와 그 자손만 OK
		tvList.add(new Tv());
//		tvList.add(new Audio());  // Tv의 자손이 아니기 때문에 에러
		
		printAll(productList);
//		printAll(tvList);  // 컴파일 에러
	}
	
	public static void printAll(ArrayList<Product> list) {
		for (Product p : list)
			System.out.println(p);
	}

}

class Product {}
class Tv2 extends Product {}
class Audio2 extends Product {}