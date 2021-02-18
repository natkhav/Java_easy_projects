package multithreading_eg2;

public class Printer {
	
	public synchronized static void printPages(Pages page) {
		System.out.println(page.getPage1());
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
	}
		System.out.println(" " + page.getPage2());

    }
}