public class QuickSortWithMedianOfThree {

	/*
	 * getMedian method which calculates which element has the middle
	 * value among the most left, most right and the middle index of the array.
	 */
	public static int getMedian(int A[],int l,int r){
		int m = ((r-l)/2) + l;
		if((A[r] < A[m] && A[m] < A[l]) || (A[l] < A[m] && A[m] < A[r])) {
			return m;
		}
		else if((A[m] < A[l] && A[l] < A[r]) || (A[r] < A[l] && A[l] < A[m])) {
			return l;
		}
		else {
			return r;
		}
    }
	
	/* 
	 * New partition method which initially uses getMedian method to find the optimum pivot
	 * and swaps it with the first element of the array.
	 */
	public static int partition(int A[], int l, int r) {
		int x = getMedian(A,l,r);
		int pivot = A[x];
		QuickSort.swap(A, x, r);
		int i = l - 1;
		for(int j = l; j < r; j++) {
			if (A[j] <= pivot) {
				i++;
				QuickSort.swap(A, i, j);
			}
		}
		QuickSort.swap(A, i+1 ,r);
		return i + 1;
	}
	
	// Quick sort method that uses the new partition.
	public static void quickSort(int A[], int p, int r) {
		if (p < r) {
			int q = partition(A,p,r);
			quickSort(A,p,q-1);
			quickSort(A,q+1,r);
		}
	}

/*	public static void main(String args[]) {
		int A[] = {5,4,3,7,6,8,9,1,2,10,11,12,16,15,0};
		quickSort(A, 0, A.length-1);
	}*/
}
