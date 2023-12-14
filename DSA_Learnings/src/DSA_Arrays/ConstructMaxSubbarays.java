package DSA_Arrays;

public class ConstructMaxSubbarays {

	public static void main(String[] args) {
		
		int[] A = {3,-2,6,2,8};
		
		int[] ans = solution(A);
		
		for(int i : ans) {
			System.out.println(i);
		}
	}

	private static int[] solution(int[] a) {
		
		int[] ans = new int[a.length];
		
		ans[0] = a[0];
		
		for(int i = 1; i < a.length; i++) {
			
			ans[i] = ans[i-1]<a[i]?a[i]:ans[i-1]; 
		}
		
		return ans;
	}
}
	