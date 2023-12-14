package com.dsa.questions;

public class MaxSumofSubarrays {

	public static void main(String[] args) {
		
		int[] A = {1,4,-2};
		
		int ans = solution(A);
		
		System.out.println(ans);
	}

	private static int solution(int[] a) {
		
		int ans = 0;
		int max = Integer.MIN_VALUE;
		
		int[] prefixsum = new int[a.length];
		
		prefixsum[0] = a[0];
		
		for(int i = 1; i < a.length; i++) {
			
			prefixsum[i] = prefixsum[i-1]+a[i];
		}
		
		for(int i = 0; i < a.length;i++) {
			
			for(int j = i; j < a.length;j++) {
				
				
				
				if(i == 0) {
					
					if(prefixsum[j] > max) {
						
						max = prefixsum[j];
					}
				}else {
					
					if((prefixsum[j]-prefixsum[i-1])>max) {
						
						max = prefixsum[j]-prefixsum[i-1];
					}
				}
				
			}
		}
		
		ans = max;
		
		return ans;
	}
}
