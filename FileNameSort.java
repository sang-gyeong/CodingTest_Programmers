import java.util.*;
public class FileNameSort {
	public String[] solution(String[] files) {
		String[] answer = {};

		String [] head = new String [files.length];
		String [] number = new String [files.length];
		String [] tail = new String [files.length];

		for (int i=0; i<files.length; i++) {
			boolean numStart = false;
			boolean numEnd = false;
			String name = files[i];
			head[i]="";
			number[i]="";
			tail[i]="";
			
			for (int j=0; j<name.length(); j++) {
				if (number[i].length()==5 || (numStart && !(name.charAt(j)<='9' &&name.charAt(j)>='0'))) {
					numEnd = true;
				}
				if (!numStart && !(name.charAt(j)<='9' &&name.charAt(j)>='0')) {
					head[i] += name.charAt(j);
				}
				else if (name.charAt(j)<='9' && name.charAt(j)>='0' && number[i].length()<5) {
					numStart = true;
					number[i] += name.charAt(j);
				}
				else if (numEnd) {
					tail[i] += name.charAt(j);
				}
			}
		}
		for (int i=0; i<files.length; i++) {
			System.out.print(head[i] + " ");
			System.out.print(number[i]+ " ");
			System.out.print(tail[i]+ " ");
			System.out.println();
		}

		return answer;
	}
}
