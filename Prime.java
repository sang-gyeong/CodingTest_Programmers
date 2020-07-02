class Prime { // 소수 찾기
  public int solution(int n) {
	  int [] prime = new int [n];
	  int answer = 0;
	  boolean [] check = new boolean [n+1]; 
//지워졌으면 true, 안지워졌으면 false 
	 
	  for (int i=2; i<=n; i++) {
		  if (check[i]==false) {
			  prime[answer++]=i;
			  for (int j=i*i; j<=n; j+=i) {
				  check[j]=true;
			  }
		  } 
	  }  
      return answer;
  }
}