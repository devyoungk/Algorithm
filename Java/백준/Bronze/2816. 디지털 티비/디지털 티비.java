import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] ch = new String[N];
		
		int idx1 = -1;
		int idx2 = -1;
		for (int i = 0; i<N; i++) {
			ch[i] = sc.next();
			if (ch[i].equals("KBS1")) {
				idx1 = i;
			} else if (ch[i].equals("KBS2")) {
				idx2 = i;
			}
		}
		String ans = "";
		
		for (int i=0; i<idx1; i++) {
			ans += "1";
		}
		for (int i=0; i<idx1; i++) {
			ans += "4";
		}
		if (idx1 > idx2) {
			idx2++;
		}
		for (int i=0; i<idx2; i++) {
			ans += "1";
		}
		for (int i=0; i<idx2-1; i++) {
			ans += "4";
		}
		
		System.out.println(ans);
	}
}