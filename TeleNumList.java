import java.util.*;
class TeleNumList {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        int [] c = new int [phone_book.length];
        for (int i=0; i<phone_book.length; i++) {
        	c[i] = Integer.parseInt(phone_book[i]);
        }
        Arrays.sort(c);
        for (int i=0; i<phone_book.length; i++) {
        	phone_book[i] = String.valueOf(c[i]);
        }
        
        
        
        for(int i=0; i<phone_book.length; i++) {
        	for (int j=i+1; j<phone_book.length; j++) {
        		if (phone_book[j].substring(0, phone_book[i].length()).equals(phone_book[i])) {
        			return false;
        		}
        	}
        }
        return answer;      
    }
}