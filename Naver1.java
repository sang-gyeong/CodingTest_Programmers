import java.util.Arrays;
class Naver1 { //01h09m

	static boolean checkDuplication(String s) {
		String[]strings = s.split("");
		Arrays.sort(strings);
		for (int i=0; i<strings.length-1; i++) {
			if(strings[i].equals(strings[i+1])) {
				return true;
			}
		}
		return false;
	}

	public int solution(String[] A) {
		int answer = 0;
		for (int i=0; i<A.length;i++) {
			String s = "";
			if(!checkDuplication(A[i])) {
				s = A[i];
			}

			for (int j=i+1; j<A.length; j++) {
				if(!checkDuplication(A[j])) {
					s+=A[j];
				}
				if (!checkDuplication(s)) {
					if (s.length()>answer) {
						answer = s.length();
					}
				}else {
					break;
				}

			}
		}
		return answer;

	}
}