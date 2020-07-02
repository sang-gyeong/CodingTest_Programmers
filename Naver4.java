
public class Naver4{//0h35m

	public int solution2(int A, int B) {
		int answer = 0;
		String s = Integer.toBinaryString(A*B);

		for (int i=0; i<s.length(); i++) {
			if (s.charAt(i)=='1') {
				answer++;
			}
		}

		return answer;
	}
	
	public int solution(int A, int B) {
		int answer = 0;
		long value = A*B;
		
		while (value!=0) {
			value = value&(value-1);
			answer++;
		}
		return answer;
	}
}



