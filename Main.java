// Main.java

class MyThread extends Thread{
	public void run(){
		System.out.println(" Thread Started ");
	}
}

class Main
{
	public static void main(String args[]){
		MyThread t = new MyThread();
		t.start();
	}
}