class PhoneNum {
  public String solution(String phone_number) {
      String answer = "";
      
      String [] a = phone_number.split("");
      
      for(int i=0; i<phone_number.length()-4;i++) {
    	  answer += "*";
      }
      for(int i=phone_number.length()-4; i<phone_number.length();i++) {
    	  answer += a[i];
      }
      
      return answer;
  }
}