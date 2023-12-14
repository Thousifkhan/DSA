package com.dsa.questions;
/*
 *  1+3 = 4
 *  3+4 = 7
 *  4+5 = 9
 *  5+6 = 11
 *  1+3+4+5 = 13
 *  3+4+5+6 = 18
 *  
 *  ans 33
 * 
 * */
public class SumofAllEvenLengthSubarrays {

	public static void main(String[] args) {
		
		int[] A = {1,3,4,5,6};
		
		int ans = solution(A);
		
		System.out.println(ans);
	}

	private static int solution(int[] a) {
		
		int ans = 0;
		int n = a.length;
		int size = 0;
		
		while(size <= n) {
			
			int sum = 0;
			
			for(int i = 0 ; i <= n-size; i++) {
				
				for(int j = i; j < i+size;j++) {
					
					sum+=a[j];
				}
			}
			
			ans+=sum;
			size+=2;
		}
		
		
		return ans;
	}
}
