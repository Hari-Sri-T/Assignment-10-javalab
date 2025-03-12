// Main.java

class MyThread extends Thread{
	
	private int init;
	private int increment;
	private int delay;
	
	public MyThread(int init, int increment, int delay){
		this.init = init;
		this.increment = increment;
		this.delay = delay;
	}
	
	public void run(){
		
	}
}

class Main
{
	public static void main(String args[]){
		//MyThread t = new MyThread();
		//t.start();
		
		new Thread (new MyThread()).start();
	}
}