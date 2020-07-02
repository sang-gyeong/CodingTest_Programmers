import java.util.*;
class Uniform {
	public int solution(int n, int[] lost, int[] reserve) {
        Queue <Integer> res = new LinkedList<>();
		Queue <Integer> los = new LinkedList<>();
		for (int i=0; i<lost.length; i++) {
			for (int j=0; j<reserve.length; j++) {
				if (lost[i]==reserve[j]) {
					lost[i]=-1;
					reserve[j]=-1;
				}
			}
		}
		Arrays.sort(lost);
		Arrays.sort(reserve);
		for (int i=0; i<lost.length; i++) {
			if (lost[i]!=-1) los.add(lost[i]);
		}
		for (int i=0; i<reserve.length; i++) {
			if (reserve[i]!=-1) res.add(reserve[i]);
		}
		int answer = n-los.size();
		while(!los.isEmpty() && !res.isEmpty()) {
			if (los.peek()>res.peek()) {
				int c = res.poll();
				if(los.peek()==c+1) {
					los.poll();
					answer+=1;
				}
			}else if (los.peek()<res.peek()) {
				int c = los.poll();
				if (res.peek()==c+1) {
					res.poll();
					answer+=1;
				}
			}
		}
		return answer;
	}
}

