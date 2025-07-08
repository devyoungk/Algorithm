import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        for (int i=0; i<T; i++){
            int answer = 0;
            String s = in.nextLine();
            int l = s.length();
            int score = 0;
            for (int j=0; j<l; j++){
                char c = s.charAt(j);
                if(c=='O'){
                    score += 1;
                    answer += score; 
                }
                else{
                    score = 0;
                }
            }
            System.out.println(answer);
        }
    }
}