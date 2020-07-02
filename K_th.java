import java.util.*;

public class K_th {

	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int [commands.length];

		List <Integer> cut = new ArrayList<>();

		for (int i=0; i<commands.length;i++) {

			for (int j=commands[i][0]-1; j<= commands[i][1]-1; j++) {
				cut.add(array[j]);
			}
			Collections.sort(cut); //배열 오름차순으로 정렬 (문자열도 가능) 

			answer[i] = cut.get(commands[i][2]-1);
			cut.clear();
		}

		return answer;
	}

}
