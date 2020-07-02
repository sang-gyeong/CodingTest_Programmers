import java.util.*;

class MathLoser {
    public int[] solution(int[] answers) {

    	int [] score = new int [3];
    	
    	int [] a = {1,2,3,4,5}; //5
    	int [] b = {2,1,2,3,2,4,2,5}; //8
    	int [] c = {3,3,1,1,2,2,4,4,5,5}; //10
    	
    	for (int i=0; i<answers.length; i++) { //else if 라고 했다가 계속 틀림ㅠㅠ 주의!! 
    		if (a[i%5] == answers[i]) {
    			score[0]++;
    			}
    		if (b[i%8] == answers[i]) {
    			score[1]++;
    			}
    		if (c[i%10] == answers[i]) {
    			score[2]++;
    			}
    	}
    
    	int winner = score[0]; //1번학생을 가장 높은 값으로 정해두고 
    	for(int i=0; i<score.length; i++) {//비교해가면서 가장 큰 값을 구함 
    		if (winner < score[i]) {
    			winner = score[i];		
    		}
    	}
    	List <Integer > win = new ArrayList<>();
    	
    	for (int i=0; i<score.length; i++) { //최댓값과 일치하는 경우에 리스트에 추가 
    		if (winner == score[i]) {
    			win.add(i);
    		}
    	}
    	
    	int [] answer = {};
    	answer = new int[win.size()]; //배열 크기 조정 
    	
    	for (int i=0; i<win.size(); i++) {
    		answer[i] = win.get(i)+1;
    	}
    	
        return answer;
    }
}