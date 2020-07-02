package Level3;

import java.util.*;

public class Palindrome {

	static ArrayList<Integer> list = new ArrayList<>();

	static void countOdd(String s, int i) {
		int ans = 1;
		int k = 1;

		while(i+k<s.length() && i-k>=0) {		
			if (s.charAt(i+k)==s.charAt(i-k)) {
				ans+=2;
				k++;
			}else {
				break;
			}
		}
		list.add(ans);

		return;
	}
	static void countEven(String s, int i) {
		if (s.charAt(i)!=s.charAt(i+1)) {
			return;
		}
		int ans = 2;
		int k = 1;
		
		while(i-k>=0 && i+1+k<s.length()) {
			if (s.charAt(i-k)==s.charAt(i+1+k)) {
				ans +=2;
				k++;
			}else {
				break;
			}
		}
		
		list.add(ans);
		
		return;
	}



	public int solution(String s){
		int answer = -1;

		for (int i=0; i<s.length(); i++) {
			countOdd(s, i);
			if (i!=s.length()-1) {
				countEven(s,i);
			}
		}
		
		
		for (int i=0; i<list.size(); i++) {
			
			if (list.get(i) > answer) {
				answer = list.get(i);
			}
		}


		return answer;
	}
}
