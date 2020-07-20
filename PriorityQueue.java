import java.util.Comparator;
import java.util.PriorityQueue;

class Priorityqueue {
    public int[] solution(String[] operations) {
        PriorityQueue <Integer> maxPQ = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue <Integer> minPQ = new PriorityQueue<>();
        
        for (int i=0; i<operations.length; i++){
            String [] a = operations[i].split(" ");
            if (a[0].equals("I")){
               maxPQ.add(Integer.parseInt(a[1]));
                minPQ.add(Integer.parseInt(a[1]));
            }else{
                if (a[1].equals("-1")){
                    if (maxPQ.isEmpty()) continue;
                    int min = minPQ.peek();
                    maxPQ.remove(min);
                    minPQ.remove(min);
                }else{
                    if (maxPQ.isEmpty()) continue;
                    int max = maxPQ.peek();
                    maxPQ.remove(max);
                    minPQ.remove(max);  
                }
            }
        }
        
        int[] answer = new int [2];
        if (!maxPQ.isEmpty()) {
            answer[0] = maxPQ.peek();
            answer[1] = minPQ.peek();
        }else{
             answer[0] = 0;
            answer[1] = 0;
        }
        return answer;
    }
}