import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        in.close();

        if (90<=score){
            System.out.println("A");
        } else if (80<=score){
            System.out.println("B");
        } else if (70<=score){
            System.out.println("C");
        } else if (60<=score){
            System.out.println("D");
        } else{
            System.out.println("F");
        }
    }
}