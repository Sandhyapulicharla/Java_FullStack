package nov19;

public class MainAnnonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(){
			@Override
			public void run() {
				System.out.println(Thread.currentThread());
			}
		};
		t1.start();
		Runnable r1=new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread());
			}
		};
		Thread t2=new Thread(r1);
		t2.setName("Second");
		t2.setPriority(8);
		t2.start();
	}

}
