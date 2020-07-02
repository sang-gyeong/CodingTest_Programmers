package Level3;

import java.util.*;


import java.util.*;


public class TravelRoute { //여행경로 
	
	static boolean [] check = new boolean[10002];
	static ArrayList<String> answers = new ArrayList<>();
	
	static void go(String begin, String [][] tickets, String route) {
		if (route.length()==4*(tickets.length + 1)) {
			answers.add(route);	
		}
		
		for (int i=0; i<tickets.length; i++) {
			if (begin.equals(tickets[i][0]) && check[i]==false) {
				check[i]=true;
				go(tickets[i][1], tickets, route+tickets[i][1]+" ");
				check[i]=false;
			}
		}

		return;
	}


	public String[] solution(String[][] tickets) {
		check = new boolean[tickets.length];
		
		go("ICN", tickets, "ICN ");
	
        
		String[] answer = answers.get(0).split(" ");
	
        for (int i=1; i<answers.size(); i++) {
			String [] tmp = answers.get(i).split(" ");
			for (int j=0; j<answer.length; j++) {
                if (tmp[j].compareTo(answer[j])>0){
                    break;
                }
				else if (tmp[j].compareTo(answer[j])<0) {
                    answer = tmp;
					continue;
				}
			}
		}

		return answer;
	}
}
