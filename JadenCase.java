
public class JadenCase {
	public String solution(String s) {
		String answer = "";
		String [] str = s.split(" ");

		for (int i=0; i<str.length; i++) {
			answer += str[i].substring(0,1).toUpperCase();
			answer += str[i].substring(1,str[i].length()).toLowerCase();
			
			if(i!=str.length-1)answer+=" ";
		}
		return answer;
	}
}

//
//if (Integer.parseInt(str[i].substring(0,1))<=9 && Integer.parseInt(str[i].substring(0,1))>=0) {
//	continue;
//}