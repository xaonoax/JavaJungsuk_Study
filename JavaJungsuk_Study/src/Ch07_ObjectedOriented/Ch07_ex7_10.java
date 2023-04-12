package Ch07_ObjectedOriented;

public class Ch07_ex7_10 {

	public static void main(String[] args) {
		Unit[] group = { new Marine(), new Tank(), new Dropship() };  // 배열의 생성 + 초기화
		
		for (int i=0; i<group.length; i++)
			group[i].move(100,  200);

	}

}

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() { /* 현재 위치에 정지 */ }
}

class Marine extends Unit {  // 보병
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ", y=" + y + "]");
	}
	void stimPack() { /* 스팀팩 사용 */ }
}

class Tank extends Unit {  // 탱크
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ", y=" + y + "]");
	}
	void changeMode() { /* 공격모드를 변환 */ }
}

class Dropship extends Unit {  // 탱크
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ", y=" + y + "]");
	}
	void load() { /* 선택된 대상을 태움 */ }
	void unload() { /* 선택된 대상을 내림 */ }
}