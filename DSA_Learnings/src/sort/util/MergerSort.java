package sort.util;

import java.util.ArrayList;
import java.util.List;

public class MergerSort {

	void mergeSort(int[] arr) {

		sort(arr);
		
	
	}

	public void sort(int[] arr) {

		
		int size = arr.length;
		int mid = size / 2;
		int[] lsh = new int[mid];
		int[] rsh = new int[size-mid];

		if (size < 2) {
			return;
		}
		for (int i = 0; i < mid; i++) {
			lsh[i]= arr[i];
		}
		for (int i = mid; i < size; i++) {

			rsh[i-mid]= arr[i];
		}

		sort(lsh);
		sort(rsh);

		merge(arr, lsh, rsh);
		

	}

	private void merge(int[] arr, int[] lsh, int[] rsh) {

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < lsh.length && j < rsh.length) {
			
			
			if (lsh[i] <= rsh[j]) {
				arr[k]=lsh[i];
				i++;
			} else {
				arr[k]=rsh[j];
				j++;
			}
			k++;
		}

		while (i < lsh.length ) {
			arr[k]=lsh[i];
			i++;
			k++;
		}
		while (j < rsh.length) {
			arr[k]=rsh[j];
			j++;
			k++;
		}

	}

}
