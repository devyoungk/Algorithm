import java.io.IOException;
import java.util.*;

class Main {
    public static int sol(int k, int n){
        int[][] A = new int[k+1][n+1];
        for (int i=1; i<n+1; i++){
            A[0][i] = i;
        }
        for (int i=1; i<k+1; i++){
            for (int j=1; j<n+1; j++){
                A[i][j] = A[i][j-1] + A[i-1][j];
            }
        }
        return A[k][n];
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i=0; i<T; i++){
            int k = in.nextInt();
            int n = in.nextInt();
            System.out.println(sol(k,n));
        }
    }
}