import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        if ((n%4==0 && n%100!=0) || n%400==0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}