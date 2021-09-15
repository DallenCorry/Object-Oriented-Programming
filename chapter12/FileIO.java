package files;

import java.io.*;
import java.util.*;

/**
 * FileIO creates a file and populates it with random integers, then prints those integers out in increasing order
 * @author Dallen Corry	
 * @version 1.0
 * @since 09/13/2021
 *
 */
public class FileIO {

	/**
	 * The main class
	 * @param args (String[]) unused
	 */
	public static void main(String[] args) {
		File myFile = new File("Exercise12_15.txt");
		PrintWriter myWriter;
		Scanner myScanner;
		int[] myArray = new int[100];
		//create the new file
		try {
			if(!myFile.exists()) {
				myFile.createNewFile();
			}
			myWriter = new PrintWriter(myFile);
			myScanner = new Scanner(myFile);
			
			//populate the file with 100 random numbers from 1 to 100
			for(int i=0; i<myArray.length; i++) {
				myWriter.print(Math.round(Math.random()*100)+" ");
			}
			myWriter.close();
			
			//read into array, sort, and then print Array no need to write to the file, no need to print from the file, right?
			for(int i =0; i<myArray.length; i++) {
				myArray[i] = myScanner.nextInt();
			}
			
			//sort the array
			Arrays.sort(myArray);
			
			//print out the sorted numbers
			int count=0;
			for(int i = 0; i<myArray.length; i++) {
				System.out.print(myArray[i]+" ");
				//print in lines of 10
				count++;
				if(count>9) {
					System.out.println();
					count = 0;
				}
			}
		}catch(Exception e){
			System.out.println(e);
		}	
	}
}
