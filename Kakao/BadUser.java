package Kakao;

import java.util.*;
public class BadUser {
	
	public boolean isBad(String now, String s) {
		for (int i=0; i<now.length(); i++) {
			if (now.charAt(i)=='*') {
				continue;
			}else {
				if (now.charAt(i)!=s.charAt(i)) {
					return false;
				}
			}
		}
		return true;
	}
	
	public int solution(String[] user_id, String[] banned_id) {
		int answer = 0;	
		int n = user_id.length;
		int m = banned_id.length;
		
		boolean [][] a = new boolean [m][n];
		
		for (int j=0; j<m; j++) {
			String now = banned_id[j];
			for (int i=0; i<n; i++) {
				if (user_id[i].length() != now.length()) {
					continue;
				}
				if (isBad(now, user_id[i])) {
					a[j][i]=true;
				}
			}
		}
		
		
		
		
		return answer;
	}
}
