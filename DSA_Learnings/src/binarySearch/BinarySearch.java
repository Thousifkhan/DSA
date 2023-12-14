package binarySearch;

import java.util.ArrayList;
import java.util.List;

import search.util.BinarySearchUtil;
import sort.util.MergerSort;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] a = {18,9,34,10,22,50,7};
		
		
		MergerSort sort = new MergerSort();
		
		sort.sort(a);
		
		for(int i : a) {
			System.out.println(i);
		}

		BinarySearchUtil search = new BinarySearchUtil();
		int res = search.search(a, 50);
		
		System.out.println("==="+(res+1));
		
		
		
	}
}
