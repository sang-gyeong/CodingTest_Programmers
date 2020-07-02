import java.util.*;
public class CandidateKey { //후보키 
	public int solution(String[][] relation) {
		int answer = 0;
		HashMap <Integer, String> map = new HashMap<>();
		boolean [] c = new boolean [relation[0].length];
		List<String>list = new ArrayList<>();
		List<String>list2 = new ArrayList<>();

		for (int i = 0; i<relation[0].length; i++) {
			for (int j=0; j<relation.length; j++) {
				list.add(relation[j][i]);
			}
			for(int j=0; j<list.size(); j++) {
				for(int k=0; k<j; k++) {
					if(list.get(j).equals(list.get(k))) {
						c[i] = true;

					}
				}
			}
			list.clear();
		}

		for (int i=0; i<relation[0].length; i++) {
			if (c[i]==false) {
				answer++; 
				continue;
			}
			if(!list.isEmpty()) {
				for (int j=0; j<list.size(); j++) {
					for (String k : relation[i-1]) {
						if(k.equals(list.get(j))) {
							
						}
					}
					
				}

			}

			for (int j=0; j<relation.length; j++) {
				if (map.containsValue(relation[i][j])) {
					list.add(relation[i][j]);
				}
				map.put(i,relation[i][j]);
			}





		}

		return answer;
	}
}
