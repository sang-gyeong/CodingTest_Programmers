import java.util.*;
class Truck {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		int sum = 0;
		Queue <Integer> tq = new LinkedList<>();
		Queue <Integer> q = new LinkedList<>();
		for (int i=0; i<truck_weights.length; i++) {
			tq.add(truck_weights[i]);
		}

		while (true) {
			if (q.size()==bridge_length) {

				sum -= q.remove();
				if (sum+tq.peek()<=weight) {
					sum +=tq.peek();
					q.add(tq.remove());
					answer++;
				}else {
					q.add(0);
					answer++;
				}

			}if(q.size()<bridge_length) {
				if (sum+tq.peek()<=weight) {
					sum +=tq.peek();
					q.add(tq.remove());
					answer++;
				}else {
					q.add(0);
					answer++;
				}
			}
			if (tq.isEmpty()) {
					answer+=bridge_length;
				
				break;
			}

		}

		return answer;
	}
}