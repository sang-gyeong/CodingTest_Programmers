import java.util.*;

public class Camouflage {

	public int solution(String[][] clothes) {
		int answer = 0;

		HashMap<String, String> hashmap = new HashMap<>();

		for (int i=0; i<clothes.length; i++) {
			hashmap.put(clothes[i][1], clothes[i][0]);
		}

		System.out.println(hashmap.size());




		return answer;
	}
}
