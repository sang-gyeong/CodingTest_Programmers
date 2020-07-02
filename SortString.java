import java.util.*;

class SortString {
  public String [] solution(String[] strings, int n) {
	  char [] c = new char [strings.length]; 
	  String[] answer = new String [strings.length];
	  List<String> list = new ArrayList<>();
	  
	  Arrays.sort(strings);
	  
	  for(int i=0;i<strings.length;i++) {
		  c[i] = strings[i].charAt(n);
	  }
	  
	  Arrays.sort(c);
	  
	  for(int i=0;i<strings.length;i++) {
		  for(int j=0;j<strings.length;i++) {
			  if(c[i]==strings[j].charAt(n)) {
					 list.add(strings[j]);	  
			  }
			  break;
		  }
	  }
	  for(int i=0;i<strings.length;i++) {
		  answer[i] = list.get(i);
	  }
	  
	  
      return answer;
  }
}





//
//
//for (int i=0;i<strings.length;i++) {
//	  for (int j=0; j<strings.length;j++) {
//		  if(strings[i].charAt(n)>strings[j].charAt(n)) {
//			  String tmp = strings[i];
//			  strings[i] = strings[j];
//			  strings[j] = tmp;
//		  }  
//	  }
//}