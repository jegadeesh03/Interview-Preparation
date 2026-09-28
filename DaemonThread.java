package Introduction;

public class DaemonThread extends Thread {

	
	public DaemonThread(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}
	public void run()
    {
        // Checking whether the thread is Daemon or not
        if(Thread.currentThread().isDaemon())
        {
            System.out.println(getName() + " is Daemon thread");
        }
         
        else
        {
            System.out.println(getName() + " is User thread");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThread d1 = new DaemonThread("t1");
		DaemonThread d2 = new DaemonThread("t2");
		DaemonThread d3 = new DaemonThread("t3");
		
		d1.setDaemon(true);
		d1.start();
		d2.start();
		
		d3.setDaemon(true);
		d3.start();
	}

}
