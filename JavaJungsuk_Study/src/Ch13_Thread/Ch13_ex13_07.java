package Ch13_Thread;

class Ch13_ex13_07 implements Runnable {
	static boolean autoSave = false;

	public static void main(String[] args) {  // 일반 Thread
		Thread t = new Thread(new Ch13_ex13_07());  // Thread(Runnable r)에 제공
		t.setDaemon(true);  // 이 부분이 없으면 종료 안 됨
		t.start();			// 위 아래 순서가 바뀌면 안 됨
		
		for (int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {}
			System.out.println(i);
			
			if (i==5) autoSave = true;
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() {  // Daemon Thread
		while (true) {
			try {
				Thread.sleep(3 * 1000);
			}
			catch(InterruptedException e) {}
			
			// autoSave의 값이 true이면 autoSave()를 호출한다.
			if (autoSave) autoSave();
		}
	}
	
	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}

}