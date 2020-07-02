package Level3;
import java.util.*;

class Server{
	double start;
	double end;
	Server(double start, double end){
		this.start = start;
		this.end = end;
	}
}

public class Day1_traffic { //추석 트래픽 
	public int solution(String[] lines) {
		int answer = 0;
		List <Server> list = new ArrayList<>();
		for (int i=0; i<lines.length; i++) {
			String [] split = lines[i].split(" ");
			String [] cal_time = split[1].split(":");
			
			double time = Double.parseDouble(cal_time[0])*3600 +  Double.parseDouble(cal_time[1])*60
					+  Double.parseDouble(cal_time[2]);
			double t = Double.parseDouble(split[2].substring(0, split[2].length()-1));
			
			list.add(new Server(time-t+0.001, time));
		}
		
		double [] starts = new double [list.size()];
		double [] ends = new double [list.size()];
		for (int i=0; i<list.size(); i++) {
			starts[i] = list.get(i).start;
			ends[i] = list.get(i).end;
		}
		
		Arrays.sort(starts);
		Arrays.sort(ends);
		
		for (double i=starts[0]; i<=ends[ends.length-1]; i+=0.001) {
			double startTimeMilli = i;
			double endTimeMilli = i+9;
		}
		
		
		return answer;
	}

	
}