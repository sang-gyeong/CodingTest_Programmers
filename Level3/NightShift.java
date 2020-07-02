package Level3;

import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> time = new PriorityQueue<>(Collections.reverseOrder());

        for (int i=0; i<works.length; i++) {
            time.offer(works[i]);
        }
        
        for (int i=0; i<n; i++) {
            int max = (int)time.poll();
            if (max <= 0) break;
            time.offer(max - 1);
        }
        
        return sumPow(time);
    }
    
    long sumPow(PriorityQueue<Integer> time) {
        long sum = 0;
        while (!time.isEmpty()) {
            sum += Math.pow(time.poll(), 2);
        }
        return sum;
    }
    
}