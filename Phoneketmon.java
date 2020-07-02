import java.util.*;
public class Phoneketmon { //폰켓몬 
	public int solution(int[] nums) {
		int answer = 1;
		Arrays.sort(nums);
		int k = nums.length/2;
		for (int i=0; i<nums.length-1;i++) {
			if (nums[i]!=nums[i+1])
				answer++;
		}
		if (k<answer) return k;
		return answer;
	}
}

