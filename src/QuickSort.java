import java.util.Arrays;

public class QuickSort {
	
	public static void swap(int array[],int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}


	public static int partition(int A[], int p, int r) {
		int x = A[r];
		int i = p - 1;
		for(int j = p; j <= r-1; j++) {
			if (A[j] <= x) {
				i++;
				swap(A, i, j);
			}
		}
		swap(A, i+1 ,r);
		return i + 1;
	}


	public static void quicksort(int A[], int p, int r){
		if (p < r) {
			int q = partition(A,p,r);
			quicksort(A,p,q-1);
			quicksort(A,q+1,r);
		}
	}
	
	public static void main(String args[]) {
		int A[] = {6,5,0,4,1,8,3};
		int p = 0;
		int r = A.length-1;
		System.out.println("Before : " + Arrays.toString(A));
		quicksort(A, p, r);
		System.out.println("After : " + Arrays.toString(A));
	}
}