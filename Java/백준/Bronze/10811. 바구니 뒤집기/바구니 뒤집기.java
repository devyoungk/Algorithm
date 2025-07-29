import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++){
            A[i] = i+1;
        }
        for (int t=0; t<M; t++){
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;

            int x = j-i+1;
            while (i < j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            } 
            
        }
        for (int a:A){
            System.out.print(a + " ");
        }
    } 
}