import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int max = 0;
        int idx = 0;
        for(int i=1; i<10; i++){
            int n = in.nextInt();
            if (n>max){
                max = n;
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }
}