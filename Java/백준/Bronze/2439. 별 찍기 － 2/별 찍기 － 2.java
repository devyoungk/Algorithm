import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=1; i<n+1; i++){
            for (int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}