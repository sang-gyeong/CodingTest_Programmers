import java.util.*;
public class Printer {

	public int solution(int[] priorities, int location) {
		int answer = 1;
		Deque <Integer> dq = new LinkedList <>();
		Stack <Integer> stack = new Stack<>();
		for (int i=0; i<priorities.length; i++) {
			dq.add(priorities[i]);
		}
		Arrays.sort(priorities);
		for (int i=0; i<priorities.length; i++) {
			stack.push(priorities[i]);
		}
		while(true) {
			if(location != 0) {
				if (dq.peekFirst()<stack.peek()) {
					dq.addLast(dq.pollFirst());
				}else {
					dq.pollFirst();
					stack.pop();
					answer++;
				}
				location--;
			}else if(location == 0) { //0일때 
				if (dq.peekFirst()<stack.peek()) {
					dq.addLast(dq.pollFirst());
					location = dq.size()-1;
				}else {
					break;
				}
			}
		}
		return answer+location;
	}
}