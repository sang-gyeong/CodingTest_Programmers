import java.util.*;
class Solution { //큰 수 만들기 
	public String solution(String number, int k) {
		char [] c = new char [number.length()-k];
		Stack <Character> stack = new Stack<>();
		int count = 0;
		for (int i=0; i<number.length(); i++) {
			char a = number.charAt(i);
			if (!stack.isEmpty() && stack.peek()<a && count<k) {
				stack.pop();
				stack.add(a);
				count++;
			}else {
				stack.add(a);
			}
		}
		for (int i=0; i<c.length; i++) {
			c[i] = stack.get(i);
		}
		return new String(c);
	}
}

