import java.util.*;
public class NextBigNum {//다음 큰 숫자 
	
	public int solution(int n) {
		String m=Integer.toBinaryString(n);
		int tmp=0;
		for (int i=0; i<m.length();i++) {
			if (m.charAt(i)=='1') {
				tmp++;
			}
		}
		int num = 0; int ntmp=0;
		for (num=n+1; tmp!=ntmp; num++) {
			m=Integer.toBinaryString(num);
			ntmp=0;
			for (int j=0; j<m.length(); j++) {
				if (m.charAt(j)=='1') {
					ntmp++;
				}
			}
		}
		return num-1;
	}
}

