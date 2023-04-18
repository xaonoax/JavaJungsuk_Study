package Ch09_Class;

public class Ch09_ex9_02 {

	public static void main(String[] args) {
		Person p1 = new Person(801108111122L);
		Person p2 = new Person(801108111122L);
		
		if (p1.equals(p2))
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 같은 사람입니다.");
	}

}

class Person {
	long id;
	
	public boolean equals(Object obj) {
		if (obj instanceof Person)
			return id == ((Person)obj).id;
		else
			return false;
	}
	
	Person(long id) {
		this.id = id;
	}
}