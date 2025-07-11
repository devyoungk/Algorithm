import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int[] A = new int [3];
        while (true){
            
            A[0] = in.nextInt();
            if (A[0]==0){
                break;
            }
            A[1] = in.nextInt();
            A[2] = in.nextInt();
            Arrays.sort(A);
            if (A[0]*A[0]+A[1]*A[1]==A[2]*A[2]){
                System.out.println("right");
            }
            else{
                System.out.println("wrong");
            }
        }
    }
}