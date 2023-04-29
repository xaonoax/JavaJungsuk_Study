package Ch13_Thread;

class Ch13_ex13_11 {
	
	static long startTime = 0;
	
	public static void main(String[] args) {
		ThreadCh13_ex13_11_1 th1 = new ThreadCh13_ex13_11_1();
		ThreadCh13_ex13_11_2 th2 = new ThreadCh13_ex13_11_2();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();
		
		try {
			th1.join();  // main쓰레드가 th1의 작업이 끝날때까지 기다림
			th2.join();  // main쓰레드가 th2의 작업이 끝날때까지 기다림
		}
		catch(InterruptedException e) {}
		
		System.out.print("소요시간:" + (System.currentTimeMillis() - startTime));
	}

}

class ThreadCh13_ex13_11_1 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print(new String("-"));
		}
	}
}

class ThreadCh13_ex13_11_2 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print(new String("|"));
		}
	}
}