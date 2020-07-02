package Level3;

import java.util.*;
public class Day2_PaperFolding { //종이접기 

	public static StringBuilder add(StringBuilder s) {
		StringBuilder ans = s;
		StringBuilder rev = new StringBuilder();
		int n = s.length();
		for (int i=0; i<n; i++) {
			if (s.charAt(i)=='0') {
				rev.append("1");
			}else {
				rev.append("0");
			}
		}
		ans.append("0");
		ans.append(rev.reverse());

		return ans;
	}


	public int[] solution(int n) {
		int [] answer = new int [(int)Math.pow(2, n)-1];	

		answer[((int)Math.pow(2,n)-2)/2]=0;
		if (n==1) {
			return answer;
		}	
		StringBuilder s = new StringBuilder();
		s.append("0");
		while(s.length()!=(int)Math.pow(2, n)-1) {
			s = add(s);
		}
		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i)=='0') {
				answer[i] = 0;
			}else {
				answer[i] = 1;
			}
		}	
		return answer;
	}
}
