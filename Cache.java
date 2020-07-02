import java.util.*;
public class Cache { //캐시 
	public static int solution(int cacheSize, String[] cities) {
		int answer = 0;
		if(cacheSize == 0) {
			return 5*cities.length;
		}
		Map<String,Integer> cacheBox = new LinkedHashMap<String,Integer>();	
		List<String> cacheBox2 = new LinkedList<String>();

		for ( int i = 0 ; i < cities.length; i++ ) {
			String city = cities[i].toUpperCase();
			int time = 5;
			if( cacheBox.get(city) == null ) {
				if ( cacheBox.size() < cacheSize ) {
					cacheBox.put(city,1);
					cacheBox2.add(city);
				}else { 
					cacheBox.put(city,1);
				cacheBox2.add(city);

				cacheBox.remove(cacheBox2.get(0));
				cacheBox2.remove(0);
				}
			}else { 
				time=1;
				cacheBox2.remove(city); 
				cacheBox2.add(city);
			}
			answer+=time;
		}
		return answer;
	}
}
