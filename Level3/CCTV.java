package Level3;


import java.util.*;

class Car {
	int start;
	int end;
	Car(int start, int end){
		this.start = start;
		this.end = end;
	}
}

public class CCTV {
	public int solution(int[][] routes) {
		int answer = 0;
		int count = 0;

		List <Car> list = new ArrayList<>();
		List <Integer> all = new ArrayList<>();
		
		for (int i=0; i<routes.length; i++) {
			list.add(new Car(routes[i][0], routes[i][1]));
			all.add(routes[i][0], routes[i][1]);
		}
		
		Collections.sort(all);
		
		for (int i=0; i<all.size(); i++) {
			int now = all.get(i);
			count = 0;
			for (int j=0; j<list.size(); j++) {
				if (now>=list.get(j).start && now<=list.get(j).end) {
					count ++;
				}
			}
			if (count > answer) answer = count;
		}
		return answer;
	}
}
