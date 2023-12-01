//import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {
		
		Thread1 t1 = new Thread1();
		
		Thread2 thread2 = new Thread2();
		Thread t2 = new Thread(thread2);
		
		
		
		System.out.println(Thread.currentThread().getName());
		t1.start();
		t1.join();
		t2.start();
		System.out.println(Thread.activeCount());
		
		
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getName());

	}

}
