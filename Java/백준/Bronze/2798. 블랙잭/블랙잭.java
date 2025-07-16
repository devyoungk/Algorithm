import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] Card = new int[N];
        for (int i=0; i<N; i++){
            Card[i] = in.nextInt();
        }
        int max = 0;
        for (int i=0; i<N-2; i++){
            for (int j=i+1; j<N-1; j++){
                for (int k=j+1; k<N; k++){
                    int sum = Card[i]+Card[j]+Card[k];
                    if (max<sum && sum<=M){
                        max = sum;
                    }
                }
            }
        }
        System.out.print(max);
    }
}