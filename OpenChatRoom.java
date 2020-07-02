import java.util.*;
public class OpenChatRoom { //오픈채팅방 
	public String[] solution(String[] record) {
		List<String> list = new ArrayList<>();
		HashMap<String, String> map = new HashMap<String, String>();
		
		for (int i=0; i<record.length; i++) {  
			String [] words = record[i].split(" ");
			if(words[0].equals("Enter")) {			//Enter:put(Key, Value)
				map.put(words[1], words[2]);
			}
			else if(words[0].equals("Change")) {	//Change:Value값 바꿔주기 
				map.put(words[1], words[2]);
			}	
		}
		
		for (int i=0; i<record.length; i++) {		//최종 Key,Value값 기준으로 list.add 
			String [] words = record[i].split(" ");
			if(words[0].equals("Enter")) {
				list.add(map.get(words[1])+"님이 들어왔습니다.");
			}
			else if(words[0].equals("Leave")) {
				list.add(map.get(words[1])+"님이 나갔습니다.");
			}	
		}
		
		String[] answer = new String[list.size()]; //출력 
		for (int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	}
}
