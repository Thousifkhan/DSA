package DSA_Arrays;

import java.util.Scanner;

/*
 * Given a ar[N], initially ar[]=0, return the final array after performing all the queries.
 * 
 * Queries(i,x) --> Add x to all the numbers from A[i] to A[N-1]
 * 
 * */
public class AddX {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] ar = new int[7];
		int queries = 4;

		// Brute Force Way 1 TC (Q*N)
		/*
		 * int[] ans = solution(ar, queries);
		 * 
		 * for (int i : ans) { System.out.println(i); }
		 */
		// Using prefixsum method

		int[] ans1 = soulution1(ar, queries);

		for (int i : ans1) {
			System.out.println(i);
		}
	}

	private static int[] soulution1(int[] ar, int queries) {
		int[] ans = new int[ar.length];
		int[] ps = new int[ans.length];

		while (queries > 0) {

			System.out.println("Enter the index :: ");
			int index = sc.nextInt();
			System.out.println("Enter the value  :: ");
			int value = sc.nextInt();

			if (index < ans.length) {
				ps[index] = ps[index]+ value;
			}

			
			queries--;

		}
		for(int i : ps) {
			System.out.print(i+" ");
		}
		ans[0] = ps[0];
		for (int i = 1; i < ans.length; i++) {

			ans[i] = ps[i]+ans[i - 1] ;
		}
		return ans;
	}

	private static int[] solution(int[] ar, int queries) {

		int[] ans = new int[ar.length];

		while (queries > 0) {

			System.out.println("Enter the index :: ");
			int index = sc.nextInt();
			System.out.println("Enter the value  :: ");
			int value = sc.nextInt();

			for (int i = index; i < ar.length; i++) {

				ans[i] = ans[i] + value;
			}

			queries--;

		}

		return ans;
	}
}
