package edu.ycp.cs320.GroupAQM.main;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import edu.ycp.cs320.GroupAQM.moduleDB.AddData;

//import java.io.File;

//import org.eclipse.jetty.server.Server;

public class RunData {//pulls data from API for each module every specified time duration
	@SuppressWarnings("null")
	public static void main(String[] args) throws Exception {
		
		Scanner keyboard = new Scanner(System.in);
		int hours = -1;
		String city[] = new String[4];
		city[0] = "Harriburg";
		city[1] = "Hershey";
		city[2] = "York";
		city[3] = "Lancaster";
		
		
		System.out.print("How many hours would you like this to run? (0 for infinite): ");
		hours = keyboard.nextInt();//time duration
		
		System.out.print("Which database (0=fake, 1=derby): ");
		int which = keyboard.nextInt();
		
		int counter = 0;
		
		while(hours > counter || hours == 0)
		{
			counter ++;

			for(String c : city)
			{
			System.out.println(AddData.addData(which));
			System.out.println(c);
			}
			TimeUnit.SECONDS.sleep(5);
			//TimeUnit.HOURS.sleep(1);
		}
	}
}
