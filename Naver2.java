import java.util.*;
import java.util.regex.Pattern;

public class Naver2 { //00h46m
	
	boolean getType(String word) {
		return Pattern.matches("^[a-z]*$", word);
	}

	public String solution(String s) {
		String answer = "";
		int p=0;
		int q = s.length()-1;
		char[]c = s.toCharArray();
		while(p<q) {

			if( !getType(String.valueOf(s.charAt(p))) && getType(String.valueOf(s.charAt(q))) && s.charAt(p)!=s.charAt(q)) {
				c[p]=s.charAt(q);
			}
			
			if( getType(String.valueOf(s.charAt(p))) && !getType(String.valueOf(s.charAt(q))) && s.charAt(p)!=s.charAt(q)) {
				c[q]=s.charAt(p);
			}
			if( s.charAt(p)=='?' && s.charAt(p)==s.charAt(q)) {
				c[p]='a';
				c[q]='a';
			}
			if( getType(String.valueOf(s.charAt(q)))&& getType(String.valueOf(s.charAt(p))) && s.charAt(p)!=s.charAt(q)) {
				return "NO";
			}
			
			p+=1;
			q-=1;

		}
	
		for (int i=0; i<c.length; i++) {
			answer+=c[i];
		}
		
		return answer;
	}

}


