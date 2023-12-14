package sort;

import java.util.Random;

public class MergeSort {

	public static void main(String[] args) {
		Random random = new Random();
		int[] inputArray = new int[10];

		for (int i = 0; i < inputArray.length; i++) {

			inputArray[i] = random.nextInt(100);
		}

		System.out.println("Before Sorted::");
		printArray(inputArray);

		mergeSort(inputArray);

		System.out.println("\n\nAfter Sorted");
		printArray(inputArray);
	}

	public static void mergeSort(int[] inputArray) {

		int inputArraySize = inputArray.length;

		if (inputArraySize < 2) {

			return;
		}

		int mid = inputArraySize / 2;
		int[] lsa = new int[mid];
		int[] rsa = new int[inputArraySize - mid];

		for (int i = 0; i < mid; i++) {
			lsa[i] = inputArray[i];
		}
		for (int i = mid; i < inputArraySize; i++) {
			rsa[i - mid] = inputArray[i];
		}
		mergeSort(lsa);
		mergeSort(rsa);

		merge(inputArray, lsa, rsa);
	}

	private static void merge(int[] inputArray, int[] lsa, int[] rsa) {

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < lsa.length && j < rsa.length) {

			if (lsa[i] <= rsa[j]) {
				inputArray[k] = lsa[i];
				i++;
			} else {
				inputArray[k] = rsa[j];
				j++;
			}
			k++;
		}

		while (i < lsa.length) {
			inputArray[k] = lsa[i];
			i++;
			k++;
		}
		while (j < rsa.length) {
			inputArray[k] = rsa[j];
			j++;
			k++;
		}

	}

	private static void printArray(int[] inputArray) {

		for (int i : inputArray) {
			System.out.println(i);
		}

	}
}
