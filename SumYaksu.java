class Solution {
	public String solution(String s) {
		String answer = "";
		int cnt = 0;
		String [] tokens = s.split("");
		
		
		for (String ss : tokens) {
			cnt = ss.contains(" ") ? 0 : cnt +1;
			answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
			
		}
		return answer;
	}
}