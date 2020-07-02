package Kakao;
import java.util.*;

public class DoublePriQue {

	public int[] solution(String[] operations) {
		int[] answer = {0,0};
		Deque<String> dq = new LinkedList<>();
		
		for (int i=0; i<operations.length; i++) {
			if (operations[i].charAt(0)=='I') {
				dq.offer(operations[i].substring(2, operations[i].length()));
			}
			else if(operations[i].charAt(0)=='D') {
				if(dq.isEmpty()) continue;
				if(operations[i].equals("D 1")) {
					dq.pollLast();		
				}else if (operations[i].equals("D -1")) {
					dq.pollFirst();
				}
			}
			Object [] list = dq.toArray();
			Arrays.sort(list);
			for (int j=0; j<list.length; j++) {
				dq.add((String) list[j]);
			}
		}
	
		if (!dq.isEmpty()) {
			answer[0]=Integer.parseInt(dq.peekLast());
			answer[1]=Integer.parseInt(dq.peekFirst());
		}

		return answer;
	}

}
