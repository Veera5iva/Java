
public class Thread1 extends Thread{
	public void run() {
		for(int i=10;i>0;i--) {
			try {
				System.out.println("Thread 2 is running"+i);
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
				
			}
		}
	}
}