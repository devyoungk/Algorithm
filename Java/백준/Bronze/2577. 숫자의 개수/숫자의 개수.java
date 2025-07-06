import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int X = a*b*c;
        String S = Integer.toString(X);
        for (int i=0; i<=9; i++){
            String I = Integer.toString(i);
            int cnt = S.length()-S.replace(I,"").length();
            System.out.println(cnt);
        }
    }
}