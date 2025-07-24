    import java.io.IOException;
    import java.util.*;

    class Main {
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            String S = sc.next();
            int sum = 0;
            int idx = 0;
            for (int i=0; i<S.length(); i++){
                char c = S.charAt(i);
                if (c=='*'){
                    idx = i;
                    continue;
                }
                int n = Integer.valueOf(c) - '0';
                sum += n;
                if (i%2==1){
                    sum += 2*n;
                }
            }
            if (idx % 2 == 0) { 
            for (int x = 0; x <= 9; x++) {
                if ((sum + x) % 10 == 0) {
                    System.out.println(x);
                    break;
                }
            }
        } else {
            for (int x = 0; x <= 9; x++) {
                if ((sum + 3 * x) % 10 == 0) {
                    System.out.println(x);
                    break;
                }
            }
        }
    }
}