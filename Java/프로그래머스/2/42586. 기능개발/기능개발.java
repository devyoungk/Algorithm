import java.util.*;

class Solution {
    public Deque<Integer> solution(int[] progresses, int[] speeds) {
        Deque<Integer> P = new ArrayDeque<>();
        Deque<Integer> S = new ArrayDeque<>();
        Deque<Integer> A = new ArrayDeque<>();
        
        for (int i = 0; i < progresses.length; i++){
            P.offer(progresses[i]);
            S.offer(speeds[i]);
        }
        
        while(!P.isEmpty()){
            int n = P.size();
            int x = 0;
            for (int i = 0; i < n; i++){
                int p = P.poll();
                int s = S.poll();
                P.offer(p+s);
                S.offer(s);
            }
            for (int i = 0; i < n; i++){
                int p = P.getFirst();
                if (p < 100){
                    break;
                }
                P.poll();
                S.poll();
                x++;
            }
            if (x > 0){
                A.offer(x);
            }
        }

        return A;
    }
}