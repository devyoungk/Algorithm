import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        for (int t = 0; t < 4; t++){
            int[] R1 = new int[4];
            int AX1 = sc.nextInt();
            int AY1 = sc.nextInt();
            int AX2 = sc.nextInt();
            int AY2 = sc.nextInt();
            int BX1 = sc.nextInt();
            int BY1 = sc.nextInt();
            int BX2 = sc.nextInt();
            int BY2 = sc.nextInt();
            
            if (BX1 > AX2 || AY1 > BY2 || BY1 > AY2 || AX1 > BX2){
                System.out.println("d");
            }
            else if ((AX2 == BX1 || AX1 == BX2) & (AY2 == BY1 || AY1 == BY2)){
                System.out.println("c");
            }
            else if(AX2 == BX1 || AX1 == BX2 || AY2 == BY1 || AY1 == BY2){
                System.out.println("b");
            }
            else {
                System.out.println("a");
            }
        }
    }
}