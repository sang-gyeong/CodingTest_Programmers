
public class RamenFactory {

	static int answer = 20000;
	static void go(int stock, int[] dates, int[] supplies, int index, int k, int ans) {
		if (stock<0||index>k) return;
		if (stock>=k-index||index==k) {
			if (ans<answer) answer = ans;
			return;
		}

		for (int i=0; i<dates.length; i++) {
			if(dates[i]==index) {
				go(stock-1+supplies[i],dates,supplies,index+1,k, ans+1);
			}
		}
		go(stock-1, dates, supplies, index+1, k, ans);
		
		return;
	}
	

	public int solution(int stock, int[] dates, int[] supplies, int k) {   
        go(stock, dates, supplies, 0, k, 0); 
        return answer;
    }
}
