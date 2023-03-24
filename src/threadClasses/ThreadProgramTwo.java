package threadClasses;

public class ThreadProgramTwo implements Runnable {
	
	Thread t;

	void printNames() {
		String [] names = {"Nripesh", "Bibhu", "Me"};
		for(String name: names) {
			System.out.println("ThreadProgramTwo: " + name);
		}
	}
	
		@Override
		public void run() {
			// Write Logic Code Here
			printNames();
		}
		
		public void start() {
			if(t == null) {
				t = new Thread(this);
			}
			t.start();
		}
}
