package Kakao;


import java.util.*;

public class DartGame {
	public int solution(String dartResult) {
		int answer = 0;
		int before=99999;
		int now=0;
		int num=0;
		for (int i=0; i<dartResult.length(); i++) {
			char a = dartResult.charAt(i);	
			if (a<='9' && a >='0') {
				num = Integer.parseInt(Character.toString(a));
				if (i>0) {
					if (a == '0' && dartResult.charAt(i-1)=='1') {
						num = 10;
					}
					else if (dartResult.charAt(i-1)=='S'
							|| dartResult.charAt(i-1)=='D'
							|| dartResult.charAt(i-1)=='T') {
						answer += now;
						before = now;
					}
				}
			}
			else if (a=='S' || a=='D' || a=='T') {
				if (a=='S') {
					now = num;
				}
				else if (a=='D') {
					now = num*num;
				}
				else if (a=='T') {
					now = num*num*num;
				}
				if (i==dartResult.length()-1) {
					answer += now;
				}	
			}
			else if (a=='*') {
				if (before!=99999) {
					answer += before;
				}
				now *=2;
				answer += now;
				before = now;
			}else if (a=='#') {
				now *= -1;
				answer += now;
				before = now;
			}
		}

		return answer;

	}
}
