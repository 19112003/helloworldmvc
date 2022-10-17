package helloworldmvc.model;

import java.io.File;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File doc = new File("C:\\Users\\pc\\Documents\\X2\\POO\\Cycle de vie\\WS\\helloworld.txt");
		Scanner obj = new Scanner(doc);
		
		while (obj.hasNextLine())
			System.out.println(obj.nextLine());
		
	}

}
