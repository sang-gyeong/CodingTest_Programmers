import java.util.*;
public class SecretMap {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String [n];	
		StringBuilder binaryValue = new StringBuilder();
		StringBuilder decodeValue = new StringBuilder();	
		
		for (int i=0; i<n; i++) {
			int ans = arr1[i]|arr2[i];
			binaryValue.append(Integer.toBinaryString(ans));
			while(binaryValue.length()<n) {
				binaryValue.insert(0,"0");
			}
			
			for (int j=0; j<binaryValue.length();j++) {
				Character getChar = binaryValue.charAt(j);
				if (getChar.equals('1')) {
					decodeValue.append("#");
				}else {
					decodeValue.append(" ");
				}
			}
			
			answer[i] = decodeValue.toString();
			
			decodeValue.setLength(0);
			binaryValue.setLength(0);
			
		}
		return answer;
	}
}
