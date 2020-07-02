import java.util.*;
public class FindPrime {

	static boolean isPrime(int x) {//true:소수 
		if (x==0 || x==1) return false;
		for (int i=2; 2*i<=x; i++) {
			if(x%i==0) {
				return false;
			}
		}
		return true;
	}
	static int [] c;
	static boolean [] b;
	public int go(int i, int n) { //i 0부터 
		if (i==n) {
			return 0;
		}
		String a = "";
		int ans = 0;
		for (int j : c) {
//			if(b[i] || (i==0&&j==0)|| (i!=0&&c[i-1)) continue;
			b[i] = true;
			a+= String.valueOf(j);
			go(i+1, n);
		}
		return ans;
		
	}
	
	public int solution(String numbers) {
		int answer = 0;
		b = new boolean [numbers.length()];
		c = new int [numbers.length()];
		for (int i=0; i<numbers.length(); i++) {
			c[i] = numbers.charAt(i)-'0';
		}
		
		



		return answer;
	}
}
