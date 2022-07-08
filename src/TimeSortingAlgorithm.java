import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class TimeSortingAlgorithm {

	// readFile method that reads the integers in the file and puts them in an array.
	public static int[] readFile(String fileName) throws Exception {
		
		// Number of lines counter.
		File file = new File(fileName);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		int lines = 0;
		while (reader.readLine() != null)
			lines++;
		reader.close();
		
		// File to array of integers.
		Scanner sc = new Scanner(file);
		int array[] = new int[lines];
		int i = 0;
		while (sc.hasNextInt()) {
			array[i] = sc.nextInt();
			i++;
		}
		sc.close();
		return (array);
	}

	public static void main(String args[]) throws Exception {
		
		// Replace your path for directory the test files are in.
		String path = "C:\\Users\\Memo\\Desktop\\Uni\\Algs\\Workspace\\";
		String fileList[] = { "int10.txt", "int50.txt", "int100.txt",  "int1000.txt", "intBig.txt",
				"dutch.txt","int500k.txt" };
		
		// Time calculator for all the test files with all algorithms.
		for (String file : fileList) {
			String fileName = path + file;
			System.out.println("--------------------------------------------------------------");
			System.out.print("\nTime taken to sort "+ file +":\n");
			
			// The original quick sort algorithm.
			System.out.print("\nOriginal quick sort for: ");
			long time1 = System.currentTimeMillis();
			QuickSort.quickSort(readFile(fileName), 0, readFile(fileName).length - 1);
			long time2 = System.currentTimeMillis();
			long timeTaken = time2 - time1;
			System.out.print(timeTaken + " milliseconds\n");
		
			// Quick sort with insertion sort.
			System.out.print("\nQuick sort with insertion sort for: ");
			time1 = System.currentTimeMillis();
			QuickSortWithInsertionSort.quickSort(readFile(fileName), 0, readFile(fileName).length - 1);
			time2 = System.currentTimeMillis();
			timeTaken = time2 - time1;
			System.out.print(timeTaken + " milliseconds\n");
			
			// Quick sort with median of three.
			System.out.print("\nQuick sort with median of three for: ");
			time1 = System.currentTimeMillis();
			QuickSortWithMedianOfThree.quickSort(readFile(fileName), 0, readFile(fileName).length - 1);
			time2 = System.currentTimeMillis();
			timeTaken = time2 - time1;
			System.out.print(timeTaken + " milliseconds\n");
			
			// Three way quick sort.
			System.out.print("\nThree way quick sort for: ");
			time1 = System.currentTimeMillis();
			ThreeWayQuickSort.quickSort(readFile(fileName), 0, readFile(fileName).length - 1);
			time2 = System.currentTimeMillis();
			timeTaken = time2 - time1;
			System.out.print(timeTaken + " milliseconds\n");
			
			// Merge sort.
			System.out.print("\nMerge sort for: ");
			time1 = System.currentTimeMillis();
			MergeSort.sort(readFile(fileName), 0, readFile(fileName).length - 1);
			time2 = System.currentTimeMillis();
			timeTaken = time2 - time1;
			System.out.print(timeTaken + " milliseconds\n");
		}
	}
}
