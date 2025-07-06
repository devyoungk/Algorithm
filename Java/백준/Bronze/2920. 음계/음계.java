import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        if(S.equals("1 2 3 4 5 6 7 8")){
            System.out.print("ascending");
        }
        else if(S.equals("8 7 6 5 4 3 2 1")){
            System.out.print("descending");
        }
        else{
            System.out.print("mixed");
        }
    }
}