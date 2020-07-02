import java.util.*;
public class ThatSong { //방금 그 곡 

	static int time(int sh, int sm, int eh, int em) { //재생시간 
		int t = 0;
		if (sh<=eh) {
			t = ((eh*60)+em)-((sh*60)+sm);
		}else {
			t = (((eh+24)*60)+em)-((sh*60)+sm); //자정 넘은경우 
		}
		return t;
	}

	static String shap(String str) { //샵음계 처리 
		String s = "";
		for (int i=1; i<str.length(); i++) {
			if(str.charAt(i)=='#') {
				if(str.charAt(i-1)=='C') {
					s+="c";
				}
				else if(str.charAt(i-1)=='D') {
					s+="d";
				}
				else if(str.charAt(i-1)=='F') {
					s+="f";
				}
				else if(str.charAt(i-1)=='G') {
					s+="g";
				}
				else if(str.charAt(i-1)=='A') {
					s+="a";
				}
			}else if(str.charAt(i)!='#'){
				if (str.charAt(i-1)!='#') {
					s+=str.charAt(i-1);
					if (i==str.length()-1) {
						s+=str.charAt(i);
						return s;
					}
				}else {
					if (i==str.length()-1) {
						s+=str.charAt(i);
						return s;
					}
					continue;
				}
			}
		}
		return s;
	}

	public String solution(String m, String[] musicinfos) {
		String answer = "";
		int answerTime=0;
		boolean [] check = new boolean [musicinfos.length];
		int [] times = new int [musicinfos.length];
		String [] title = new String [musicinfos.length];
		if(m.contains("#"))m = shap(m);

		for (int i=0; i<musicinfos.length; i++) {
			String [] infos =musicinfos[i].split(",");
			int sh = Integer.parseInt(infos[0].substring(0,2));
			int sm = Integer.parseInt(infos[0].substring(3));
			int eh = Integer.parseInt(infos[1].substring(0,2));
			int em = Integer.parseInt(infos[1].substring(3));
			times[i] = time(sh,sm,eh,em);
			title[i] = infos[2];
			infos[3] = shap(infos[3]);
			String s = "";
			for (int j=0; j<times[i]; j++) {
				s+= infos[3].charAt(j%infos[3].length());
			}
			if (s.contains(m)) {
				if (answerTime<times[i]) {
					answer = title[i];
					answerTime = times[i];
				}
			}
		}
		if (answer.equals("")) return "'(NONE)'";
		return answer;
	}
}
