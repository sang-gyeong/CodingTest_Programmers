import java.util.*;

public class Moonja {


	public int solution(String s) {

		int answer =s.length();

		int tmp;
		int gap;
		int count = 0;
		for(gap = 1; gap<=s.length()/2; gap++) {
			for(int i =0; i<s.length();i++) {
				int j = i+1;
				String substr = s.substring(i*gap, (i+1)*gap);
				String substr_next = s.substring(j*gap, (j+1)*gap);

			}

		}



		return answer;
	}


}
