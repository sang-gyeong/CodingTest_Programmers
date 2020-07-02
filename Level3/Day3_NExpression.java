package Level3;

import java.util.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.ScriptEngine;


public class Day3_NExpression { //N으로 표현

//	private ScriptEngineManager mgr = new ScriptEngineManager();
//	private ScriptEngine engine = mgr.getEngineByName("JavaScript");
	private int answer;

	
//	private int cal(String str) {
//		int ans=0;
//		Queue <Integer> q = new LinkedList<>();
//		
//		
//		for (int i=0; i<str.length(); i++) {
//			
//		}
//		
//		
//		
//		return ans;
//	}
//	
	
	private void go(int n, int num, String str, int count) throws ScriptException {
		System.out.println(str);
		if (count > 8) {
			return;
		}
		Stack <Character> stack = new Stack<>();
		for (int i=0; i<str.length(); i++) {
			
			if (str.charAt(i)=='(') {
				stack.add('(');
			}
			if (str.charAt(i)==')') {
				if (stack.isEmpty()) {
					return;
				}
				if (stack.peek()=='(') {
					stack.pop();
				}else {
					stack.add('(');
				}
				
			}
		}
		
		if (str.substring(str.length()-1).equals(String.valueOf(n))) {
//			int now = (int) engine.eval(str);
//			if (now==num) {
//				answer = Math.min(answer, count);
//			}
			go(n, num, str+"+", count+1);
			go(n, num, str+"/", count+1);
			go(n, num, str+"*", count+1);
			go(n, num, str+"-", count+1);
			go(n, num, str+String.valueOf(n), count+1);
		}else {
			go(n, num, str+String.valueOf(n), count+1);
		}
		
	}


	public int solution(int n, int num) throws ScriptException {
		answer = Integer.MAX_VALUE;
		go(n, num, String.valueOf(n), 1);
		go(n, num, "(", 0);
		if (answer > 8) return -1;

		return answer;
	}
}
