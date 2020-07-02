package Level3;
import java.util.*;

public class Day3_1 {
	public String solution(String sentence) {
		String answer = "";
		List <String> words = new ArrayList<>();
		int [] a = new int [27]; //알파벳 나온 갯수 
		int [] start = new int [27]; //알파벳 시작 위치  
		int [] end = new int [27]; //알파벳 끝 위치 
		
		int count = 0; //대문자갯수 
		for (int i=0; i<sentence.length(); i++) {
			if (Character.isUpperCase(sentence.charAt(i))) {
				count++;
				System.out.print(1);
			}else {
				System.out.print(0);
			}
		}

		int tmp=1;
		for (char i = 'a'; i<='z'; i++) {
			for(int j=0; j<sentence.length(); j++) {
				if (i==sentence.charAt(j)) a[tmp]+=1;
				if (sentence.charAt(j) == ' ') return "invalid";
			}
			tmp+=1;
		}
		
		tmp=1;
		char t = '#';
		for (char i = 'a'; i<='z'; i++) {
			for(int j=0; j<sentence.length(); j++) {
				if (i==sentence.charAt(j) && sentence.charAt(j)!=t) {
					t = sentence.charAt(j);
					start[tmp] = j;
					break;
				}
			}
			tmp+=1;
		}
		
		tmp=1;
		t = '#';
		for (char i = 'a'; i<='z'; i++) {
			for(int j=sentence.length()-1; j>=0; j--) {
				if (i==sentence.charAt(j) && sentence.charAt(j)!=t) {
					t = sentence.charAt(j);
					end[tmp] = j;
					break;
				}
			}
			tmp+=1;
		}
		
		for (int i=0; i<a.length; i++) {
			if (a[i]==2) {
				if (start[i]>=2) {
					if(Character.isUpperCase(sentence.charAt(start[i]-2))) {
						words.add(sentence.substring(start[i]-1, end[i]+2));
						continue;
					}
				}
				words.add(sentence.substring(start[i]+1, end[i]));
			}else if (a[i]!=0 && a[i]!=2){
				words.add(sentence.substring(start[i]-1, end[i]+2));
			}
		}
		
		int c = 0;
		for (int i=0; i<words.size(); i++) {
			String s = words.get(i);
			for (int j=0; j<s.length(); j++) {
				if(j%2==0 && Character.isLowerCase(s.charAt(j))) {
					return "invalid";
				}
				else if(Character.isUpperCase(s.charAt(j))){
					answer += s.charAt(j);
					c+=1;
				}
			}
			if(i!=words.size()-1) {
				answer+=" ";
			}
		}
		
		if (c!=count) return "invalid";

		return answer;
	}
}
