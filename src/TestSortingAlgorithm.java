public class TestSortingAlgorithm {

	// isSorted method which tests if the given array is sorted.
	public static boolean isSorted(int a[]) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		//Test for the part a:
		int randomTestArray1[] = {5,4,2,5,6,3,12,5,43,43,5,6,7,9,12,3,4,5,0,12,4,65,2,3,5,56,12,57,43,43,3,4,5,0,12,3,4,5,0,12,3,4,5,0,12,3,4,5,0,12,234,24};
		QuickSort.quickSort(randomTestArray1, 0, randomTestArray1.length - 1);
		System.out.println("The random test array is sorted using\n"+ "the (original) Quick Sort algorithm and became: " + isSorted(randomTestArray1)+"\n");
		
		//Test for the part b:
		int randomTestArray2[] = {5,4,2,254,65,36,12,57,43,43,5,68,79,90,12,3,4,5,0,12,4,65,2,3,5,56,3,4,5,0,12,4,65,2,3,5,56};
		QuickSortWithMedianOfThree.quickSort(randomTestArray2, 0, randomTestArray2.length - 1);
		System.out.println("The random test array is sorted using\n"+ "the Quick Sort with Median of Three algorithm and became: " + isSorted(randomTestArray2)+"\n");
		
		//Test for the part c:
		int randomTestArray3[] = {5,4,2,254,65,36,12,57,43,43,5,68,79,90,12,33424,6,7,4,456,31,31,131,31,31,31,13,313,13,13,131,31,13,13,5,0,12,4,65,2,3,5,56};
		QuickSortWithInsertionSort.quickSort(randomTestArray3, 0, randomTestArray3.length - 1);
		System.out.println("The random test array is sorted using\n"+ "the Quick Sort with the Inserton Sort algorithm and became: " + isSorted(randomTestArray3)+"\n");
		
		//Test for the part d:
		int randomTestArray4[] = {5,4,2,254,65,36,12,57,43,43,5,68,79,90,12,3,4,5,0,12,4,65,32,234,5,345,345,345,345,35,2342,5,46,6,435,623,565,45,6324,545,54,3,5,56,3,4,5,0,12,4,65,2,3,5,56};
		ThreeWayQuickSort.quickSort(randomTestArray4, 0, randomTestArray4.length - 1);
		System.out.println("The random test array is sorted using\n"+ "the Three Way Quick Sort algorithm and became: " + isSorted(randomTestArray4)+"\n");
		
	}
}
