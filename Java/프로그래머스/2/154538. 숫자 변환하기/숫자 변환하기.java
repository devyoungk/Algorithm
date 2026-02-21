import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        
        Queue<Integer> Q = new ArrayDeque<>();
        boolean[] visited = new boolean[y+1];
        
        Q.offer(x);
        visited[x] = true;

        while (true){
            int l = Q.size();
            if (l == 0){
                answer = -1;
                break;
            }
            for (int i = 0; i < l; i++){
                int a = Q.poll();
                if (a == y){
                    return answer;
                }
                if (a+n <= y && !visited[a+n]){
                    Q.offer(a+n);
                    visited[a+n] = true;
                }
                    
                if (a*2 <= y && !visited[a*2]){
                    Q.offer(a*2);
                    visited[a*2] = true;
                }
                    
                if (a*3 <= y && !visited[a*3]){
                    Q.offer(a*3);
                    visited[a*3] = true;
                }
                    
            }
            answer++;
        }
        
        return answer;
    }
}