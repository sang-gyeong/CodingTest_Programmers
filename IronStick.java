import java.util.*;
public class IronStick {
	public int solution(String arrangement) {
		int answer = 0;
		boolean c = true; // (:true ):false
		Stack <Character> stack = new Stack<>();

		for (int i=0; i<arrangement.length();i++) {
			if(arrangement.charAt(i)=='(') {
				stack.push('(');
				c = true;
			}
			if(arrangement.charAt(i)==')') {
				if(stack.peek()=='('&& c==true) { //발사 
					stack.pop();
					answer+=stack.size();
				}else { //막대기 끝 
					stack.pop();
                    answer++;
				}
				c = false;
			}
		}

		return answer;
	}
}