package Level3;

import java.util.*;

public class Triangle {
	
	public int solution(int[][] triangle) {
		int answer = 0;
		
		int [][] d = new int[triangle.length][triangle.length];
	     d[0][0] = triangle[0][0];
	     for(int i = 1; i < triangle.length; i++) {
	        d[i][0] = d[i-1][0] + triangle[i][0]; 
	        d[i][i] = d[i-1][i-1] + triangle[i][i];
	     }
	   
	     for(int i = 2; i < triangle.length; i++) 
	        for(int j = 1; j < i; j++) 
	           d[i][j] = Math.max(d[i - 1][j - 1], d[i - 1][j]) + triangle[i][j];
	      
	     for(int i = 0; i < d.length; i++) 
	    	 answer = Math.max(answer, d[d.length - 1][i]);
		
		
		return answer;
	}
}
