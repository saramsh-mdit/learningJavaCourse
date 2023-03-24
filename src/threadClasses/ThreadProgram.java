package threadClasses;

import java.lang.Thread;

public class ThreadProgram extends Thread {
//	Synchronized
    synchronized void printNamesSync() throws Exception {
// String Array
		String [] names = {"Nripesh", "Bibhu", "Me"};
// For Each Loop
		for(String name: names) {
			System.out.println("ThreadProgramOne: " + name);
		}
	}
    void printNames() throws Exception {
		String [] names = {"Nripesh", "Bibhu", "Me"};
		for(String name: names) {
			System.out.println("ThreadProgramOne: " + name);
//Thread.sleep(50);
		}
	}
// Write Logic Code Here
		public void run() {
			try {
				printNamesSync();
			}
			catch(Exception e) {
				System.out.println("Error Occured");
			}
		}
}
