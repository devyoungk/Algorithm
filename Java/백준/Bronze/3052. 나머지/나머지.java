import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();
        for (int i=0; i<10; i++){
            h.add(in.nextInt()%42);
        }
        in.close();
        System.out.print(h.size());
    }
}