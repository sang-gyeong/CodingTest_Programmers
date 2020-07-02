public class Carpet { //카펫 
	public int[] solution(int brown, int red) {
		int[] answer = new int [2];
		int dx=1;
		int dy=1;
		for (int i=1; i*i<=red; i++) {
			if (red%i==0) {
				if ((((red/i)+2)+(i))*2 == brown && ((red/i)+2)*(i+2)==red+brown) {
					dx=(red/i)+2;
					dy=i+2;
				}
			}
		}
		answer[0]=dx;
		answer[1]=dy;
		return answer;
	}
}

