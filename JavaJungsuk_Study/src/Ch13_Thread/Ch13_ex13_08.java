package Ch13_Thread;

class Ch13_ex13_08 {

	public static void main(String[] args) {
		ThreadCh13_ex13_08_1 th1 = new ThreadCh13_ex13_08_1();
		ThreadCh13_ex13_08_2 th2 = new ThreadCh13_ex13_08_2();
		
		th1.start();
		th2.start();
		
		delay(2*1000);
		System.out.println("<<main 종료>>");
	}
	
	static void delay(long millis) {
		try {
//			th1.sleep(2000);  // th1을 2초동안 잠들게 하기 
			Thread.sleep(2000);  // 이렇게 클래스 이름을 적어야 오해가 없음
		}
		catch (InterruptedException e) {}
		
	}

}

class ThreadCh13_ex13_08_1 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
		}
		System.out.print("<<th1 종료>>");
	}
}

class ThreadCh13_ex13_08_2 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
		}
		System.out.print("<<th2 종료>>");
	}
}
