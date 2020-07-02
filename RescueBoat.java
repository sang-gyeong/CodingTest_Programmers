import java.util.*;
public class RescueBoat {//구명보트 
	public int solution(int[] people, int limit) {
		int answer = 0;
		int k = people.length;
		Arrays.sort(people);
		Deque <Integer> dq = new LinkedList<>();	
		for (int i=0; i<people.length; i++) {
			if (people[i]>=limit) {
				k=i;
				break;
			}
			dq.add(people[i]);	
		}	
		while (!dq.isEmpty()) {
			if (dq.size()==1) {
				answer++;
				break;
			}
			if (dq.peekFirst()+dq.peekLast()<=limit) {
				int c = dq.peekFirst()+dq.peekLast();
				dq.pollFirst();
				dq.pollLast();
				dq.addLast(c);
				
			}else {
				dq.pollLast();
				answer++;
			}
		}
		answer+=people.length-k;
		
		return answer;
	}
}
