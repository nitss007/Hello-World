package helloworld;

public class ThreadDemo extends Thread {
	static String message[] =
		{ "Java", "is", "hot,", "aromatic,", "and", "invigorating."};
	public static void main(String[] args) throws InterruptedException {
		ThreadDemo td = new ThreadDemo();
		ThreadDemo td1 = new ThreadDemo();
		td.start();
		td1.start();
		
		
	}
	
	public void run(){  

		String name = getName();
        for (int i=0;i<message.length;++i) {
           randomWait();
           System.out.println(name + message[i]);
        } 
		}

	private void randomWait() {
	    {
	        try {
	           sleep((long)(3000*Math.random()));
	        } catch (InterruptedException x) {
	           System.out.println("Interrupted!");
	        }
	    }
		
	} 
}
