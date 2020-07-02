package Kakao;

import java.util.*;

public class NGame {

	public String reverse(String r) {
		String ans = "";
		for (int i=r.length()-1; i>=0; i--) {
			ans += r.charAt(i);
		}
		return ans;
	}
	
	public String solution(int n, int t, int m, int p) {
		String answer = "";
		String total = "0";
		int i = 1;
		while(total.length()<t*m) {
			String r = "";
			int tmp = i;
			while(tmp>=n) {
				int x = tmp;
				tmp/=n;
				int a = x%n;
				if (a >=10) {
					if (a==10) r +="A";
					else if (a==11) r +="B";
					else if (a==12) r +="C";
					else if (a==13) r +="D";
					else if (a==14) r +="E";
					else if (a==15) r +="F";
				}else {
					r += a;
				}
			}
			if (tmp >=10) {
				if (tmp==10) r+= "A";
				else if (tmp==11) r +="B";
				else if (tmp==12) r +="C";
				else if (tmp==13) r +="D";
				else if (tmp==14) r +="E";
				else if (tmp==15) r +="F";
			}else {
				r += tmp;
			}
			total += reverse(r);
			i++;
		}
		
		p-=1;
		for (i=p; i<total.length(); i+=m) {
			answer+=total.charAt(i);
			
			if (answer.length()==t) {
				break;
			}
		}
		
		
		
		return answer;
	}
}
