import java.util.*;
public class BecomeBlack {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int k = kb.nextInt();
		int [] a = new int [n];
		int minIndex = 0;
		for (int i=0; i<n; i++) {
			a[i] = kb.nextInt();
			if (a[i]==1) minIndex = i;
		}
		
		int answer = n/k;
		if (n%k!=0) answer+=1;
		
		System.out.println(answer);

	}

}
