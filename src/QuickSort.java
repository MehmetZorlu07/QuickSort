public class QuickSort {
	
	//Swap method to swap two elements of an array
	public static void swap(int array[],int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	// Partition for quick sort algorithm
	public static int partition(int A[], int p, int r) {
		int x = A[r];
		int i = p - 1;
		for(int j = p; j < r; j++) {
			if (A[j] <= x) {
				i++;
				swap(A, i, j);
			}
		}
		swap(A, i+1 ,r);
		return i + 1;
	}

	// Quick sort algorithm
	public static void quickSort(int A[], int p, int r){
		if (p < r) {
			int q = partition(A,p,r);
			quickSort(A,p,q-1);
			quickSort(A,q+1,r);
		}
	}
	
/*	public static void main(String args[]) {
		int A[] = {6,5,0,4,1,8,3};
		quickSort(A, 0, A.length-1);
	}*/
}