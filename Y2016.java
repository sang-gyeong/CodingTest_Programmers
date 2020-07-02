class Y2016 {
  public String solution(int a, int b) {
	  
	  
	  String [] day = {"THU", "FRI","SAT", "SUN", "MON", "TUE", "WED"};
	  int [] days = {0,31,29,31,30,31,30,31,31,30,31,30,31};
	  int sol=0;
	  
	  
	  for(int i=0; i<a; i++) {
		 sol += days[i];
	  }
	  String answer = day[(sol+b)%7];
      return answer;

  }
}