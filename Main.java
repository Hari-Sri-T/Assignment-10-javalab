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
		for(;;){
			
			try{
				System.out.println(init+" ");
				init += increment;
				sleep(delay);	
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

class Main
{
	public static void main(String args[]){
		new MyThread(1,3,3000).start();
		new MyThread(100,50,1000).start();

	}
}