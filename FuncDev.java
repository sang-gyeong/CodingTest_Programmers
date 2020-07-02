import java.util.*;
public class FuncDev { //기능개발 
	public int[] solution(int[] progresses, int[] speeds) {
		int[] answer = {};
		List <Integer> list = new ArrayList<>();
		Queue <Integer> q = new LinkedList<>();
		for (int i=0; i<progresses.length; i++) {
			q.add((int)Math.ceil((100-progresses[i])/speeds[i]));
		}
		int top = q.peek();
		int cnt = 0;
		while(!q.isEmpty()) {
			if (q.peek()<=top) {
				q.poll();
				cnt++;
			}else {
				top=q.peek();
				list.add(cnt);
				cnt=0;
			}
		}
		list.add(cnt);
		answer = new int [list.size()];
		for (int i=0; i<list.size(); i++) {
			answer[i] = list.get(i).intValue();
		}
		return answer;
	}
}

