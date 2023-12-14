package com.dsa.questions;

public class SumofAllOddLengthSubarrays {

	public static void main(String[] args) {
	
		int[] A = new int[] {1,3,4,5};
		
		int ans = solution(A);
		
		System.out.println(ans);

	}

	private static int solution(int[] a) {
		
		int ans = 0;
		int arraySize = a.length;
		int initialSize = 1;
		
		
		while(initialSize <= arraySize) {
			int sum = 0;
			
			for(int i = 0; i <= arraySize-initialSize;i++) {
				
				for(int j = i ; j < i+initialSize; j++) {
					
					sum+=a[j];
				}
			}
			ans+=sum;
			initialSize+=2;
		}
		
		
		
		return ans;
	}

}
