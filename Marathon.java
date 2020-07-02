import java.util.*;

public class Marathon {

	public String solution(String [] participant, String [] completion) {
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		int i=0;
		for(i=0; i<completion.length; i++) { // i로 통일 
			if(!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		return participant[i]; //마지막 이름 
	}
}

//Array.sort 메소드를 사용하여 두 배열을 오름차순으로 정리해주므로써 효율성, 시간절약 가능
//다른사람들의 풀이를 보니 해시맵을 사용한 경우가 많았음.  

