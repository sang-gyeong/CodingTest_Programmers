package Level3;

public class Day2_2 {
	public static int sol(int n) {
		int answer = 0;
		long [] a = new long [n+1];

		a[1] = 1;
		a[2] = 2;


		for (int i=3; i<=n; i++) {
			a[i] = (a[i-1] + a[i-2]) % 1000000007;
		}
		answer = (int) a[n];

		return answer;
	}

	public static void main (String args[]) {
		int a = sol(50000);
		System.out.println(a);
	}
}
