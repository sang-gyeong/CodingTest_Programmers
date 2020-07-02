import java.util.*;

class Sqrt {
	public long solution(long n) {
		long answer = 0;
		float f = (float) Math.sqrt(n);
		int x = (int)Math.sqrt(n);

		if(f-x==0) answer = (long) Math.pow(x+1,2);
		else answer = -1;




		return answer;
	}



	public int[] solution(int[] arr) { //제일 작은 수 제거하기 

		int[] answer = {};

		if (arr.length == 1) {
			answer = new int [1];
			answer[0] = -1;
		}

		else {
			List <Integer> list = new ArrayList<>();

			int min = arr[0];
			for(int i=0; i<arr.length;i++) {
				if(arr[i]<min) {
					min = arr[i];
				}
			}
			for(int i=0; i<arr.length;i++) {
				if(arr[i]!=min)
					list.add(arr[i]);
			}

			answer = new int [list.size()];
			for(int i=0; i<list.size();i++) {
				answer[i] = list.get(i).intValue();
			}
		}
		return answer;
	}
}