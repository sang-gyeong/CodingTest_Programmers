package Kakao;

import java.util.*;




public class GwalhoChange {

	static boolean isRight(String p) {

		Stack <Character> stack = new Stack<>();

		for (int i=0; i<p.length(); i++) {
			char now = p.charAt(i);
			if (stack.isEmpty() && now=='(') {
				stack.add(now);
			}
			else if (stack.isEmpty() && now==')') {
				return false;
			}
			else if(stack.peek()=='(' && now==')') {
				stack.pop();
			}else {
				stack.add(now);
			}
		}
		if (!stack.isEmpty()) return false;
		return true;
	}


	public String solution(String p) {
		String answer = "";

		if (p.equals("")) return "";
		if(isRight(p)) return p;
		
		String u = "";
		String v = "";
		
		int countA = 0;
		int countB = 0;
		
		for (int i=0; i<p.length(); i++) {
			if (p.charAt(i)=='(') countA++;
			else if (p.charAt(i)==')') countB++;
			u += p.charAt(i);
			
			if(countA==countB) {
				if(i!=p.length()-1) v = p.substring(i+1);
				break;
			}
		}
		if (isRight(u)) {
			return u + solution(v);
		}
		
		answer = "(";
		answer += solution(v);
		answer += ")";
		for (int i=1; i<u.length()-1; i++) {
			if (u.charAt(i)=='(') answer+=")";
			if (u.charAt(i)==')') answer+="(";
		}



		return answer;
	}
}
