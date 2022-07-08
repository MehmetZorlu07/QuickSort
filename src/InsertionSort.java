public class InsertionSort {

	// Insertion sort algorithm.
	public static void insertionSort(int a[], int p, int r){
		for (int j = p; j <= r; j++){
			int key = a[j];
			int i = j-1;
			while ((i >= 0) && (a[i] > key)){
				a[i+1] = a[i];
				i--;
			}
			a[i+1] = key;
		}
	}
}
