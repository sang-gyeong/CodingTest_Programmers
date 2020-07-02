import java.util.*;
public class NewsClustering { //뉴스 클러스터링 
	public int solution(String str1, String str2) {
		int answer = 0;
		List<String>list1 = new ArrayList<>();
		List<String>list2 = new ArrayList<>();

		for (int i=0; i<str1.length()-1; i++) { //알파벳이 아닌경우 추가 
			if(str1.toLowerCase().charAt(i)>='a'&&str1.charAt(i)<='z'
					&&str1.toLowerCase().charAt(i+1)>='a'&&str1.charAt(i+1)<='z')
				list1.add(str1.toLowerCase().substring(i, i+2));
		}

		for (int i=0; i<str2.length()-1; i++) {//알파벳이 아닌경우 추가 
			if(str2.toLowerCase().charAt(i)>='a'&&str2.charAt(i)<='z'
					&&str2.toLowerCase().charAt(i+1)>='a'&&str2.charAt(i+1)<='z')
				list2.add(str2.toLowerCase().substring(i, i+2));
		}
		
		double gyo=0;//교집합 
		boolean [] b = new boolean[list2.size()];
		for (int i=0; i<list1.size(); i++) {
			for (int j=0; j<list2.size(); j++) {
				if(list1.get(i).equals(list2.get(j)) && b[j]==false) { //교집합 확인 
					gyo++;
					b[j]=true;
					break;
				}
			}
		}
		double hap = list1.size() + list2.size() - gyo;//합집합 
		
		if (gyo==0) {//0인경우 예외처리 
			if (hap==0) return 65536;
			else return 0;
		}
		answer = (int)((gyo/hap) * 65536); //정수형으로 변환되면서 소수점아래 탈락
		return answer;
	}
}
