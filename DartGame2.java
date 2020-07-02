import java.util.*;
public class DartGame2 {
	public int solution(String dartResult) {
		int answer = 0;
		int middle = 0;
		int xint = 1;
		boolean c = false;
		boolean d = false;
		for (int i=0; i<dartResult.length(); i++) {
			if (dartResult.charAt(i)-'0'==0 && d == true) {
				middle = 10;
				d = false;
				break;
			}
			if (Character.isDigit(dartResult.charAt(i))) {
				answer+=middle*xint;
				middle = dartResult.charAt(i)-'0';
				if (dartResult.charAt(i)-'0'==1) {
					d = true;
				}
				else {
					if (dartResult.charAt(i)-'0'==0 && d == true) {
						middle = 10;
					}
					d = false;
				}
				xint = 1;
				if (c){
					answer *=2;
					c = false;
				}
			}
			if (dartResult.charAt(i) == 'D') {
				middle*=middle;
			}
			if (dartResult.charAt(i) == 'T') {
				middle*=middle;
				middle*=middle;
			}	
			if (dartResult.charAt(i) == '*') {
				c = true;
			}
			if (dartResult.charAt(i) == '#') {
				xint=-1;
			}
			System.out.print(answer + " ");
		}
		answer += middle*xint;
		if (c){
			answer *=2;
		}
		return answer;
	}
	
	
	
	
	
	
	
	
	
}
