import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        String s = "";
        s += a;
        s += b;
        System.out.println(a+b-c);
        System.out.println(Integer.parseInt(s)-c);
    }
}