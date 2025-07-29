import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char[][] A = new char[5][];
        int max = 0;
        for (int i=0; i<5; i++){
            String S = sc.next();
            max = Math.max(max, S.length());
            char[] C = new char[S.length()];
            for (int j=0; j<S.length(); j++){
                C[j] = S.charAt(j);
            }
            A[i] = C;
        }
        String answer = "";
        for (int j=0; j<max; j++){
            for (int i=0; i<5; i++){
                if (A[i].length >= j+1){
                    answer += A[i][j];
                }
            }
        }
        System.out.println(answer);
    }
}