import java.util.*;

public class NoSameNum {
	public int[] solution(int []arr) {
		int[] answer = {};

		Stack <Integer> stack = new Stack<>();

		for (int i=0; i<arr.length;i++) {

			if (stack.empty()||stack.peek()!=arr[i]) {
				stack.push(arr[i]);
			}
			if (stack.peek()==arr[i]) {
			}
		}
		
		answer = new int [stack.size()];
		
		for (int i=stack.size()-1 ; i>=0; i--) {
			answer[i] = stack.pop();
		}

		return answer;
	}
}


