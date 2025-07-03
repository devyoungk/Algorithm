import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = in.nextInt();

        char c = str.charAt(n-1);
        System.out.println(c);
    }
}