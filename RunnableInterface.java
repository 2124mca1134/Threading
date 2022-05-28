package fundamental;
class NewThread extends Thread{
	Thread t;
	NewThread(String Name){
		super(Name);
	}
	public void run() {
		try {
			for(int i=1; i<=5;i++)
			{
		System.out.println("Child Thred "+i);
		Thread.sleep(500);
			}
		}
			catch(InterruptedException e) {
				System.out.println(e);
			}
	}
}

public class RunnableInterface {

	public static void main(String[] args) {
		NewThread t =new NewThread("Thread");
		t.start();
		try {
			for(int i=1;i<=5; i++) {
				System.out.println("Main thread"+i);
				Thread.sleep(600);
			}
		}
catch(InterruptedException e) {
	System.out.println(e);
}
	}

}
