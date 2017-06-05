package part1;

public class RunnableLambda {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i< 3; i++) {
					System.out.println("Hello world from thread " + Thread.currentThread().getName());
				}
				
			}
		};
		
		Runnable rlambda = () -> {
			System.out.println("Hello world from thread " + Thread.currentThread().getName());
		};
		
		Thread t = new Thread(rlambda);
		t.start();
		t.join();
		System.out.println("End");
	}
}
