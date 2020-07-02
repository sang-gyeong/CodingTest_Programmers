package Kakao;

public class Compression {
	class Solution {
	    public int solution(String s) {
	        int answer = 0;
	       
	        int length = s.length();
	        int tmp = 0;
	        for (int cut=1; cut<=s.length()/2; cut++ ) {
	        	for (int i=0; i<s.length(); i+=cut) {
	        		String now = s.substring(i, i+cut);
	        		
	        	}
	        	
	        	
	        	
	        }
	        
	        
	        return answer;
	    }
	}

}
