
public class MaxMin {//최댓값과 최솟값 
	public String solution(String s) {
		String answer = "";
		String[] c = s.split(" ");
		String max = c[0];
		String min = c[0];
		for (int i=0; i<c.length; i++) {
			if (Integer.parseInt(c[i])>Integer.parseInt(max)) {
				max = c[i];
			}
			if (Integer.parseInt(c[i])<Integer.parseInt(min)) {
				min = c[i];
			}
		}
		answer = min + " "+ max;
		return answer;
	}
}
