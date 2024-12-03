package application;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);
		File[] folder = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for(int i = 0; i < folder.length; i++) {
			System.out.println(folder[i]);
		}
		
		System.out.println();
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for(int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
		
		boolean success = new File(strPath + "/subdir").mkdir();
		if(success) System.out.println("Sucesso!");
		sc.close();
	}

}
