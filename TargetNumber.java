public class TargetNumber {//타겟넘버 

	static int answer=0;
	
	static void go(int index, int[]numbers, int target, int sum) {
		if(index == numbers.length) {
			if (sum==target) answer+= 1;
			return;
		}
		
		go(index+1, numbers, target, sum+numbers[index]);
		go(index+1, numbers, target, sum+ (numbers[index]*-1));
		
	}
	
	public int solution(int[] numbers, int target) {
		go(0, numbers, target, 0);
		
		return answer;
	}
}