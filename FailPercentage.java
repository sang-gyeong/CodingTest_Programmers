import java.util.*;
public class FailPercentage {
	public int[] solution(int n, int[] stages) {
		List <Integer> list = new ArrayList<>();
		int[] answer = new int [n];
		int [] arrived = new int [n];
		int [] fail = new int [n];
		float [] perc = new float [n];
		for (int i=0; i<n; i++) {
			for (int j=0; j<stages.length; j++) {
				if(stages[j]>=i+1) {
					arrived[i]++;
					if (stages[j]==i+1) {
						fail[i]++;
					}
				}
			}
			if (arrived[i] > 0){
				perc[i] = ((float)fail[i]/(float)arrived[i])*100;
			}
		}
		float [] copy = perc;
		Arrays.sort(copy);

//		for (int i=n-1; i>=0; i--) {
//			for (int j=0; j<n; j++) {
//				if (perc[j]==copy[i] && !list.cont
//					list.add(j+1);
//				}
//			}
//		}
//		for (int i=0; i<n; i++) {
//			answer[i]=list.get(i);
//		}
		return answer;
	}
}
