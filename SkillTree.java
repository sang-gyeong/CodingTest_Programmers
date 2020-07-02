import java.util.*;
public class SkillTree {
	public int solution(String skill, String[] skill_trees) {
		int answer = 0;


		for (int i=0; i<skill_trees.length; i++) {
			Queue <Character> q = new LinkedList<>();
			boolean isok = true;
			for (int j=0; j<skill.length(); j++) {
				q.add(skill.charAt(j));
			}
			for (int j=0; j<skill_trees[i].length(); j++) {
				char c = skill_trees[i].charAt(j);
				if (q.contains(c)) {
					if (q.peek()==c) {
						q.remove();
					}else {
						isok = false;
					}
				}
			}
			if(isok) {
			answer++;
			}
		}
		return answer;
	}
}
