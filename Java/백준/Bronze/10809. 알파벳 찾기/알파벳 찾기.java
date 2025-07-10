import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int[] A = new int[26];
        for (int i = 0; i < A.length; i++) {
            A[i] = -1;
        }
        int l = s.length();
        for (int i=0; i<l; i++){
            char c = s.charAt(i);
            int n = (int) c - 97;
            if(A[n]==-1){
                A[n] = i;
            }
        }
        for (int a: A){
            System.out.print(a + " ");
        }
    }
}