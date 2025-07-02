import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        while (true){
            int a = in.nextInt();
            if (a==0){
                break;
            }
            int b = in.nextInt();
            System.out.println(a+b);
        }
    }
}