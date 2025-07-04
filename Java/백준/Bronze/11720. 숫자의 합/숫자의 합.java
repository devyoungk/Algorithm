import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        String s = in.next();

        for (int i=0; i<n; i++){
            int x = s.charAt(i) - '0';
            sum += x;
        }
        System.out.print(sum);
    }
}