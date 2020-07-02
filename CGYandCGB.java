
public class CGYandCGB {

	public int[] solution(int n, int m) {
		int[] answer = new int [2];

		int k=n;
		int l=m;
		while(true){
			if(l==k) {
				break;
			}
			l=k;
			k=l%k;
		}

		answer[0] = l;
		answer[1] = 3;

		return answer;
	}

}
