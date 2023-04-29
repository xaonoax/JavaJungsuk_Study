package Ch13_Thread;

class Ch13_ex13_03 {
	
	static long startTime = 0;
	
	public static void main(String[] args) {
		ThreadCh13_ex13_03_1 th1 = new ThreadCh13_ex13_03_1();
		th1.start();
		startTime = System.currentTimeMillis();
		
		for (int i=0; i<300; i++) {
			System.out.printf("%s", new String("-"));
		}
		
		System.out.print("소요시간1:" + (System.currentTimeMillis() - startTime));
	}

}

class ThreadCh13_ex13_03_1 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print(new String("|"));
		}
		
		System.out.print("소요시간2:" + (System.currentTimeMillis()));
	}
}