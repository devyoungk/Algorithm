import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();

        for (int i=0; i<N; i++){
            int a = in.nextInt();
            if (a<X){
                System.out.print(a+" ");
            }
        }
    }
}