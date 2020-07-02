import java.util.*;
public class GwalHo {
	public static Stack <Character> stack;
	static boolean isRight(String u) {
		for (int i=0; i<u.length();i++) {
			if (u.charAt(i)=='(') {
				stack.add('(');
			}
			if (u.charAt(i)==')'&& !stack.isEmpty()) {
				stack.pop();
			}
			if (u.charAt(i)==')' && stack.isEmpty()) {
				return false;
			}
		}
		if (stack.isEmpty()) return true; //올바른
		else return false; //올바른x 
	}
	static String split(String w) {
		String u = "";
		String v = "";
		int open = 0;
		int close = 0;
		for (int i=0; i<w.length();i++) {
			if (w.charAt(i)=='(') {
				open++;
				u+= '(';
			}if (w.charAt(i)==')') {
				close++;
				u+= ')';
			}
			if (open>0&&open==close) {
				v=w.substring(open+close) ;
				break;
			}
		}
		return u;
	}
	static String split2(String w) {
		String u = "";
		String v = "";
		int open = 0;
		int close = 0;
		for (int i=0; i<w.length();i++) {
			if (w.charAt(i)=='(') {
				open++;
				u+= '(';
			}if (w.charAt(i)==')') {
				close++;
				u+= ')';
			}
			if (open>0&&open==close) {
				v=w.substring(open+close) ;
				break;
			}
		}
		return v;
	}
	public String solution(String p) {
		String answer = "";
	
		if (!isRight(split(p))){
			answer+='(';
			
		}else {
			
		}	
		return answer;
	}
}
