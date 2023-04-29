package Ch13_Thread;

class Ch13_ex13_06 {

	public static void main(String[] args) {
		ThreadCh13_ex13_06_1 th1 = new ThreadCh13_ex13_06_1();
		ThreadCh13_ex13_06_2 th2 = new ThreadCh13_ex13_06_2();
		
//		th1.setPriority(5);  // 기본값이기 때문에 주석처리해도 출력됨
		th2.setPriority(7);
		
		System.out.println("Priority of th1(-) : " + th1.getPriority());
		System.out.println("Priority of th2(|) : " + th2.getPriority());
		th1.start();
		th2.start();		
	}

}

class ThreadCh13_ex13_06_1 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
			for (int x=0; x<10000000; x++);  // 시간지연용 for문
		}
	}
}

class ThreadCh13_ex13_06_2 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
			for (int x=0; x<10000000; x++);
		}
	}
}
