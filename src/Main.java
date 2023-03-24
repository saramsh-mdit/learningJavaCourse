// Import Package

//import School.*;
//import threadClasses.*;
import java.io.*;

public class Main {
	
	public static void ReadFromFile (String path) throws IOException {
		File fPath = new File(path);
//		FileInputStream IFile = new FileInputStream(fPath,"utf-8");
		FileReader IFile = new FileReader(fPath);
		char[] inputData = new char[(int) fPath.length()];
		IFile.read(inputData);
		System.out.println(inputData);
		IFile.close();
	}
	
	public static void WriteToFile (String path, String message) throws IOException {
		File fPath = new File(path);
//		FileOutputStream IFile = new FileOutputStream(fPath);
		FileWriter IFile = new FileWriter(fPath);
//		byte outputBytes[] = message.getBytes();
		IFile.write(message);
		IFile.close();
	}
	
	public static void ReadAndWrite(String inputPath, String outputPath) throws IOException {
		File InputPath = new File(inputPath);
		FileReader IFile = new FileReader(inputPath);
		FileWriter OFile = new FileWriter(outputPath);
		char[] inputData = new char[(int) InputPath.length()];
		IFile.read(inputData);
		OFile.write(inputData);
		IFile.close();
		OFile.close();
	}
		
	
	
	public static void main(String [] args) {

		try {
//		ReadFromFile("./names.txt");
		WriteToFile("./hello.txt","Ram is Awesome");
//		ReadAndWrite("./hello.txt","./secondHello.txt");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}


/*
 * FOR PACKAGE
public static void main(String [] args) {
		Student s1 = new Student("Nripesh", 57);
		Student s2 = new Student();
		System.out.println(s1.getName());
		s1.display();
		s2.display();
	}
*/

/*
 * 
 * FOR THREADS
 public static void main(String [] args) {
//		Thread Programs
		ThreadProgram tp1 = new ThreadProgram(); 
		ThreadProgramTwo tp2 = new ThreadProgramTwo(); 

// Thread

		Thread t2 = new Thread(tp2);

// Set Priority (1-10) default: 5 
		tp1.setPriority(1);
		t2.setPriority(10);

// Run Thread
		tp1.start();
		tp2.start();
		
	}
*/
