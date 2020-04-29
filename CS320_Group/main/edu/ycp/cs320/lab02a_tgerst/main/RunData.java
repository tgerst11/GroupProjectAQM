package edu.ycp.cs320.lab02a_tgerst.main;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import edu.ycp.cs320.lab02a_tgerst.moduleDB.AddData;

//import java.io.File;

//import org.eclipse.jetty.server.Server;

public class RunData {
	public static void main(String[] args) throws Exception {
		
		Scanner keyboard = new Scanner(System.in);
		int hours = -1;
		
		System.out.print("How many hours would you like this to run? (0 for infinite): ");
		hours = keyboard.nextInt();
		
		System.out.print("Which database (0=fake, 1=derby): ");
		int which = keyboard.nextInt();
		
		int counter = 0;
		
		while(hours > counter || hours == 0)
		{
			System.out.println(AddData.addData(which));
			counter ++;
			//TimeUnit.SECONDS.sleep(5);
			TimeUnit.HOURS.sleep(1);
		}
	}
}
