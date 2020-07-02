import java.util.*;
public class Naver3 {
	public int solution(int[] A) { //0h10m
		List <Integer> list = new ArrayList<>();
		int c = 0;

		for (int i=0; i<A.length;i++) {
			if (A[0]==0) {
				for (int j=1; j<A.length;j++) {
					if(j%2==1 && A[j]!=1) {
						c++;
					}
					if (j%2==0 && A[j]!=0) {
						c++;
					}
				}
				list.add(c);
			}
		}
		c=0;
		for (int i=0; i<A.length;i++) {
			if (A[0]==1) {
				for (int j=1; j<A.length;j++) {
					if(j%2==1 && A[j]!=0) {
						c++;
					}
					if (j%2==0 && A[j]!=1) {
						c++;
					}
				}
				list.add(c);
			}	  		  
		}
		c=0;
		for (int i=0; i<A.length;i++) {
			if (A[0]==0) {
				for (int j=1; j<A.length;j++) {
					if(j%2==1 && A[j]!=0) {
						c++;
					}
					if (j%2==0 && A[j]!=1) {
						c++;
					}
				}
				list.add(c+1);
			}	  		  
		}
		c=0;
		for (int i=0; i<A.length;i++) {
			if (A[0]==1) {
				for (int j=1; j<A.length;j++) {
					if(j%2==1 && A[j]!=1) {
						c++;
					}
					if (j%2==0 && A[j]!=0) {
						c++;
					}
				}
				list.add(c+1);
			}	  		  
		}
		int answer = 100;
		for (int i=0; i<list.size();i++) {
			if (answer>list.get(i)) {
				answer = list.get(i);
			}
		}
		
		return answer;
	}
}
