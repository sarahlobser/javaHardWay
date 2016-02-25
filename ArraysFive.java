/* Assignment from https://programmingbydoing.com/a/grades-in-an-array-and-a-file.html
 *
 * Assignment is to prompt the user for a first and last name, and the name for a file. 
 * Randomly choose five grades for that person from 1 to 100 and store them in an array 
 * that can hold five integers. Then output the first and last name and those five grades 
 * to the specified file.
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArraysFive {
	public static void main(String[] args) throws Exception{
		String fname, lname, filename;
		Scanner keyboard = new Scanner(System.in);
		int[] grades = new int[5];
		int i;
		
		System.out.print("First and last name: ");
		fname = keyboard.next();
		lname = keyboard.next();
		
		System.out.print("\nFile name: ");
		filename = keyboard.next();
		
		for (i = 0; i < grades.length; i++) {
			grades[i] = (int)(100*Math.random()+1);
		}
		
		PrintWriter out = new PrintWriter(filename);
			out.println(fname + " " + lname);
			for(i = 0; i < grades.length; i++) {
				out.println(i + ": " + grades[i]);
			} 
			out.close();
			
		System.out.println("Here are your randomly selected grades: ");
			for(i = 0; i < grades.length; i++) {
				System.out.println("Grade " + i + ": " + grades[i]);
			}
			
		System.out.println("Data saved in " + filename);
		
		
	}

}
