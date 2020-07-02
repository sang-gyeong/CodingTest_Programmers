package Kakao;

import java.util.*;


public class Crane {
	
	static int answer = 0;
	static Stack <Integer> stack = new Stack<>();
	static void checkNCrush(int x) {
		if (stack.isEmpty()) {
			stack.push(x);
		}else {
			if (stack.peek()==x) {
				stack.pop();
				answer +=2;
			}else {
				stack.push(x);
			}
		}
		
	}
	
	public int solution(int[][] board, int[] moves) {
		int n = board.length;
		for (int i=0; i<moves.length; i++) {
			int k = moves[i]-1;
			for (int j=0; j<n; j++) {
				if (board[j][k] !=0) {
					checkNCrush(board[j][k]);
					board[j][k]=0;
					break;
				}
			}
		}	
		return answer;
	}
}
