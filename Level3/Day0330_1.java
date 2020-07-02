package Level3;

import java.util.*;
import java.io.*;


public class Day0330_1 {
	static ArrayList<String> list = new ArrayList<>();
	static boolean [] check = new boolean [10000];

	public static String [] solution(String[][] tickets) {
		ArrayList<String> list = new ArrayList<>();
		Queue <String> q = new LinkedList<>();
		int start = -1;
		boolean [] check = new boolean [tickets.length];
		for (int i=0; i<tickets.length; i++) {
			if (check[i]==false && tickets[i][0].equals("ICN") && (start==-1 || start!= -1 && tickets[start][1].compareTo(tickets[i][1]) > 0) ) {
				start = i;
			}
		}
		list.add("ICN");
		if(start != -1) {

			check[start] = true;
			String tmp = tickets[start][1];
			q.add(tmp);
		}
		while(!q.isEmpty()) {
			String str = q.poll();
			list.add(str);
			start = -1;
			for (int i=0; i<tickets.length; i++) {
				if(check[i]==false && tickets[i][0].equals(str) && (start==-1 || start!= -1 && tickets[start][1].compareTo(tickets[i][1]) > 0)) {
					start = i;
				}
			}
			if(start != -1) {
				check[start] = true;
				q.add(tickets[start][1]);
			}
		}

		String[] answer = new String [list.size()];
		for (int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
            System.out.println(list.get(i));
		}


		return answer;
	}
}
