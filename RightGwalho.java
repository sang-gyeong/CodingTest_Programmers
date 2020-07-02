import java.util.*;
public class RightGwalho {//올바른 괄호 
	boolean solution(String s) {
		boolean answer = true;
		Stack <Character> stack = new Stack<>();
		for (int i=0; i<s.length();i++) {
			if (s.charAt(i)=='(') {
				stack.add('(');
			}else if (s.charAt(i)==')') {
				if (stack.isEmpty()) {
					return false;
				}
				else stack.pop();
			}
		}
		if (!stack.isEmpty()){
			return false;
		}
		return answer;
	}
}


