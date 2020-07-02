import java.util.*;
public class Compression { //압축 
	public int[] solution(String msg) {
		int[] answer = {};
		ArrayList<String> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		Queue <String > q = new LinkedList<>();
		list.add("#");
		for (char i='A' ; i<='Z'; i++) {
			list.add(String.valueOf(i));
		}		
		for(int i=0; i<msg.length(); i++) {
			q.add(String.valueOf(msg.charAt(i)));
		}
		while(!q.isEmpty()){
			String s = q.poll();
			while (true) {
				if (!list.contains(s + q.peek())) { 
					list.add(s+q.peek());
					list2.add(list.indexOf(s));
					break;
				}else { 
					s+=q.poll();
				}
			}
		}
		answer = new int [list2.size()];
		for (int i=0; i<list2.size(); i++) {
			answer[i] = list2.get(i);
			System.out.print(answer[i] + " ");
		}
		return answer;
	}
}


