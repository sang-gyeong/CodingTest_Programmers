package Level3;

import java.util.*;
public class WordTransform { //단어 변환 
	
	static boolean [] check = new boolean[52];
	static ArrayList <Integer> list = new ArrayList<>();
	
	
	static boolean trans(String now, String next) { //한개만 다른지 체크 
		int dif=0;
		for(int i=0; i<now.length(); i++) {
			if (now.charAt(i)!=next.charAt(i)) {
				dif++;
			}
		}
		if (dif==1) return true;
		else return false;
	}
	
	
	static void go(int tmp, String now, String [] words, String target) {
		if (now.equals(target)) {
			list.add(tmp);
			return;
		}
		
		for (int i=0; i<words.length; i++) {
			if (check[i]==false) {
				if (trans(now, words[i])) {
					check[i] = true;
					go(tmp+1, words[i], words, target);
					check[i] = false;
				}
			}
		}
		return;
	}
	
	
	
	public int solution(String begin, String target, String[] words) {
		check = new boolean[words.length];
		int answer = 0;
		
		go(0, begin, words, target);
		
		if (list.isEmpty()) return 0;
		
		int min = Integer.MAX_VALUE;
		for (int i=0; i<list.size(); i++) {
			if (list.get(i) < min) {
				min = list.get(i);
			}
		}
		
		return min;
	}
}
