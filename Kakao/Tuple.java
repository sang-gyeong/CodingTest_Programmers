package Kakao;

import java.util.*;

public class Tuple {
	public static int[] solution(String s) {
		int[] answer = {};	
		String ans = "";
		List <String> list = new ArrayList<>();
		String str = s.substring(2, s.length()-2);
		
		String [] a = str.split("\\}\\,\\{");
		
		for(int i=0; i<a.length; i++) {
			a[i]=a[i].replaceAll(",","");
			list.add(a[i]);
		}
		
		Comparator<String> compare = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		};
		
		Collections.sort(list, compare);
		ans += list.get(0);
		for(int i=0; i<list.size()-1; i++) {
			HashSet set1 = new HashSet();
			for (int j=0; j<list.get(i).length(); j++) {
				set1.add(list.get(i).charAt(j));
			}
			HashSet set2 = new HashSet();
			for (int j=0; j<list.get(i+1).length(); j++) {
				set2.add(list.get(i+1).charAt(j));
			}
			set2.removeAll(set1);
			ans += set2;
		}
		
		String [] d = ans.split("[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]");
		answer = new int [d.length];
		for (int i=0; i<d.length; i++) {
			answer[i] = Integer.parseInt(d[i]);
		}
		return answer;
	}
	public static void main(String[] args) throws Exception {
		solution("{{4,2,3},{3},{2,3,4,1},{2,3}}");
	}
}
