package multithreading;

public class RunnableThread implements Runnable{
	@Override
	public void run() { 
		//System.out.println("Hello from " + Thread.currentThread().getName() + " whose id is : "
		//		+ Thread.currentThread().getId() + " with priority " + Thread.currentThread().getPriority());
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Printing from thread "+Thread.currentThread().getName()+" value of i = "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
}