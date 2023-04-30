package Ch13_Thread;

import java.util.ArrayList;

class Ch13_ex13_15 {

public static void main(String[] args) throws InterruptedException {
		Table2 table = new Table2();
			
		new Thread(new Cook2(table), "Cook").start();
		new Thread(new Customer2(table, "donut"), "Customer1").start();
		new Thread(new Customer2(table, "buger"), "Customer2").start();
		Thread.sleep(2000);
		System.exit(0);
	}

}

class Customer2 implements Runnable {
	private Table2 table;
	private String food;
		
	Customer2(Table2 table, String food) {
		this.table = table;
		this.food = food;
	}
		
	public void run() {
		while (true) {
			try {
				Thread.sleep(100);
			}
			catch (InterruptedException e) {}
			String name = Thread.currentThread().getName();
				
			table.remove(food);
			System.out.println(name + " ate a " + food);
		}
	}
}

class Cook2 implements Runnable {
	private Table2 table;
		
	Cook2(Table2 table) {
		this.table = table;
	}
		
	public void run() {
		while (true) {
			int idx = (int)(Math.random()*table.dishNum());
			table.add(table.dishNames[idx]);
			try {
				Thread.sleep(10);
			}
			catch (InterruptedException e) {}
		}
	}
}

class Table2 {
	String[] dishNames = { "donut", "donut", "burger" };  // donut의 확률을 높임
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<>();
	
	public synchronized void add(String dish) {
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " is wating.");
			try {
				wait();  // Cook쓰레드를 기다리게 함
				Thread.sleep(500);
			}
			catch (InterruptedException e) {}
		}
		dishes.add(dish);
		notify();  // 기다리고 있는 CUST를 깨우기 위함
		System.out.println("Dishes:" + dishes.toString());
	}
		
	public boolean remove(String dishName) {
		synchronized(this) {
			String name = Thread.currentThread().getName();
			while(dishes.size() == 0) {
				System.out.println(name + " is wating.");
				try {
					wait();  // CUST쓰레드를 기다리게 함
					Thread.sleep(500);
				}
				catch(InterruptedException e) {}
			}
			
			while (true) {
				for (int i=0; i<dishes.size(); i++) {
					if (dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						notify();  // 잠자고 있는 COOK을 깨우기 위함
						return true;
					}
				}
				
				try {
					wait();  // 원하는 음식이 없는 CUST쓰레드를 기다리게 함
					Thread.sleep(500);
				}
				catch(InterruptedException e) {}
			}
		}
	}
	public int dishNum() {
		return dishNames.length;
	}
}
