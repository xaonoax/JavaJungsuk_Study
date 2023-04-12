package Ch07_ObjectedOriented;

public class Ch07_ex7_PlayerTest {

	public static void main(String[] args) {
//		Player p = new Player();  // 추상 클래스의 객체를 생성(미완성 클래스라 생성 불가
//		AudioPlayer ap = ()new AudioPlayer();
		Player ap = ()new AudioPlayer();  // 다형성
		ap.play(100);
		ap.stop();
		
	}
	
}

abstract class Player {  // 추상 클래스
	abstract void play(int pos); // 추상 메서드
	abstract void stop();        // 추상 메서드
}

//추상 클래스는 상속을 통해 완성해야 객체 생성 가능
class AudioPlayer extends Player {
	void play(int pos) { System.out.println(pos + "위치부터 play합니다."); }
	void stop() { System.out.println("재생을 멈춥니다."); }
}