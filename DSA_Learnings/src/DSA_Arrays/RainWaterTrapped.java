package DSA_Arrays;
/*
 * Given ar[N] elements, where ar[i] represents height of the building, return amount of water trapped in all buildings
 * 
 * */
public class RainWaterTrapped {

	public static void main(String[] args) {
		
		int[] A = {2,1,3,2,1,2,4,3,2,1,3};
		
		//lmax = 2,2,3,3,3,3,4,4,4,4,4
		//rmax = 4,4,4,4,4,4,4,3,3,3,3
		
		int ans[] = solution(A);
		
		for(int i : ans) {
			System.out.print(i+ " ");
		}
	}

	private static int[] solution(int[] a) {
		
		int[] ans = new int[a.length];
		
		int[] lmax = new int[a.length];
		lmax[0] = a[0];
		
		for(int i = 1; i < a.length; i++) {
			
			lmax[i] = lmax[i-1] < a[i] ? a[i]:lmax[i-1];
		}
		int[] rmax = new int[a.length];
	
		rmax[a.length-1] = a[a.length-1];
		
		for(int i = a.length -2 ; i >= 0;i-- ) {
			
			rmax[i] = rmax[i+1] < a[i] ?a[i]:rmax[i+1];
			
		}

		
		for(int i = 1; i < a.length -1 ; i++) {
			
			int level = Integer.min(lmax[i-1], rmax[i+1]);
			
			if(a[i] < level ) {
				
				int water = level - a[i];
				
				ans[i] = water;
			}
			
		}
		
		
		
		return ans;
	}
	

}
