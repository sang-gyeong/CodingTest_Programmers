public class HIndex{ //H-Index 
	public int solution(int[] citations) {
        int answer= 0;
        for (int i=0; i<citations.length; i++){
            if (citations[i]>answer) {
                answer = citations[i];
            }
        }
		while(true) {
			int up = 0;
			int down = 0;		
			for (int i=0; i<citations.length; i++) {
				if (citations[i]>=answer) up++;
				if (citations[i]<answer) down++;
			}	
			if (up>=answer && down<=answer) {
				break;
			}	
			answer--;
		}
		return answer;		
	}
}


