package search.util;

public class BinarySearchUtil {

	void binarySearch(int[] a, int numberToFind) {
		
		search(a,numberToFind);
	}

	public int search(int[] a, int numberToFind) {
		
		
		int low = 0;
		int high = a.length;
		
		while( low <= high) {
			
			int mid = (low+high) / 2;
			if(a[mid]==numberToFind) {
				
				return mid;
			}
			
			if(a[mid] > numberToFind) {
				
				high = mid-1;
			
			}else {
				
				low = mid+1;
			
			}
		}
		return -1;
		
		
	}
}
