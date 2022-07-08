import java.util.Arrays;

public class PathologicalInputSequences {
	// It crashes when the input size of the array is too large
	static int array[] = new int[100000];
	static int i = 0;
	public static void arrayInitialiser() {
		while(i < array.length) {
			array[i] = 5;
			i++;
		}
	}

	public static void main(String args[]) {
		arrayInitialiser();
	    long timeBefore = System.currentTimeMillis();
	    QuickSortWithMedianOfThree.quickSort(array, 0, array.length - 1);
	    long timeAfter = System.currentTimeMillis();
	    long timeTaken = timeAfter - timeBefore;
	    System.out.println(timeTaken + " milliseconds");
	    System.out.println(Arrays.toString(array));
	  }
}