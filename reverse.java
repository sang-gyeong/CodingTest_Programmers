class reverse {
  public long solution(long n) {
	  
	  String m = String.valueOf(n);
	  
	  String [] ss = m.toString().split("");
	  
	  for(int i=0; i<m.length();i++) {
		  for (int j=i+1; j<m.length();j++) {
			  if (Integer.parseInt(ss[j])>Integer.parseInt(ss[i])) {
				  String tmp = ss[j];
				  ss[j] = ss[i];
				  ss[i] = tmp;
			  }  
		  }
	  }
	  
	  String temp = "";
	  for(int i=0; i<m.length();i++) {
		  temp+=ss[i];
	  }
	 
	  
      long answer = Long.parseLong(temp);
      return answer;
  }
  public static void main(String [] args) {
	  
  }
}