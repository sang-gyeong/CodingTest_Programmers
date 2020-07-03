package Level3;

public class WaitingInLine {
	
	static boolean next_permutation(int [] a) {
		int i = a.length-1;
		while(i>0 && a[i-1]>=a[i]) {
			i--;
		}
		if (i<=0) {
			return false;
		}
		int j = a.length-1;
		while (a[j]<=a[i-1]) {
			j--;
		}
		int tmp = a[j];
		a[j] = a[i-1];
		a[i-1] = tmp;
		
		j = a.length -1;
		while(i<j) {
			tmp = a[j];
			a[j] = a[i];
			a[i] = tmp;
			i++;
			j--;
		}
		return true;
	}
	
	
	public int[] solution(int n, long k) {
		int[] answer = {};
		
		int [] a = new int [n+1];
		for (int i=1; i<=n; i++) {
			a[i] = i;
		}
		
		do {
			for (int i=0; i<n; i++) {
				System.out.println(a[i] + " ");
			}
			System.out.println();
		}while(next_permutation(a));
		
		
		
		return answer;
	}
}
