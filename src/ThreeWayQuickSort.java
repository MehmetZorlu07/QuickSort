public class ThreeWayQuickSort {

	/*
	 * New partition for the three way quick sorting.
	 * It puts the values lower than the pivot to the
	 * left side of itself and values greater to the right
	 * side of itself whereas there is no changes made to
	 * the values equal to itself so that they stay at middle.
	 */
	public static int[] Partition (int A[], int p, int r) {
		int m = ((r-p)/2) + p;
		QuickSort.swap(A, p, m);
		int pivot = A[p];
		int j = p;
		int i = p;
		while (j <= r) {
			if (A[j] < pivot) {
				QuickSort.swap(A, i, j);
				i++;
				j++;
			}
			else if (A[j] > pivot) {
				QuickSort.swap(A, j, r);
				r--;
			}
			else if (A[j] == pivot){
				j++;
			}
		}
		int newArray[] = {i,r+1};
		return (newArray);
	}
	
	// Quick sort method that uses the new partition for three way algorithm.
	public static void quickSort(int A[], int p, int r){
		if (p < r) {
			int[] q = Partition(A,p,r);
			quickSort(A,p,q[0]);
			quickSort(A,q[1],r);
		}
	}
	
	/*public static void main(String args[]) {
		int A[] = {6,8,9,4,2,1,4,12,15,0,4,5,4,4,4,5,67,8,12,3,4,45,56,5,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,5,5,5,5,5,5};
		quickSort(A, 0, A.length-1);
	}*/
}
