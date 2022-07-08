public class QuickSortWithInsertionSort {

	/*
	 * Quick sort that uses the partition of original quick sort.
	 * Uses insertion sort instead of quick sort when 
	 * number of elements in the subarray is less than 10
	 */
	public static void quickSort(int A[], int p, int r){
		if (p < r) {
			if(r-p < 10) {
				InsertionSort.insertionSort(A, p, r);
				}
			else {
				int q = QuickSort.partition(A,p,r);
				quickSort(A,p,q-1);
				quickSort(A,q+1,r);
			}
		}
	}
	
/*	public static void main(String args[]) {
		int A[] = {5,4,3,7,6,8,9,1,2,10,11,12,16,15,0};
		quickSort(A, 0, A.length-1);
	}*/
}
