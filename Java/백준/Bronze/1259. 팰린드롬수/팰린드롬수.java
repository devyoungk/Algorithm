import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        while(!S.equals("0")){
            String r = "";
            for (int i=S.length()-1; i>=0; i--){
                r += S.charAt(i);
            }
            String answer = S.equals(r) ? "yes" : "no";
            System.out.println(answer);
            S = in.nextLine();
        }
    }
}