import java.util.*;
public class WordChain { //영어 끝말잇기 
	public boolean isOK(String now, String next) {
		if(now.charAt(now.length()-1)!=next.charAt(0)) {
			return false;
		}
		return true;
	}
	public int[] solution(int n, String[] words) {
		int[] answer = new int [2];
		answer[0]=0;
		answer[1]=0;	
		int tmp = 110;
		for (int i=0; i<words.length-1; i++) {
			for (int j=i+1; j<words.length; j++) {
				if(words[i].equals(words[j])) {
					if(tmp>j) tmp = j;
				}
			}
		}
		int tmp2 = 110;
		for (int i=0; i<words.length-1; i++) {
			if(!isOK(words[i], words[i+1])) {
				tmp2 = i+1;
				break;
			}
		}
		if (tmp==110 && tmp2 ==110) {
			return answer;
		}
		else {
			answer[0] = Math.min(tmp, tmp2)%n+1;
			answer[1] = Math.min(tmp, tmp2)/n+1;
		}
		return answer;
	}
}
