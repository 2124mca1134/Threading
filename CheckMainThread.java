
package fundamental;

public class CheckMainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println("Current Thread"+t);
		t.setName("MyNewThread");
		System.out.println("After the name change"+t);
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(i);
				Thread.sleep(5);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

}
