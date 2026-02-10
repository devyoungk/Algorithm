import java.util.*;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		List<Integer> pos = new ArrayList<>();
		List<Integer> neg = new ArrayList<>();
		
		long ans = 0;
		
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(br.readLine());
			
			if (x > 1) pos.add(x);
			else if (x == 1) ans += 1;
			else neg.add(x);
		}
		
		Collections.sort(pos);
		Collections.sort(neg);
		
		while (!pos.isEmpty()) {
			long x = pos.remove(pos.size()-1);
			if (!pos.isEmpty()) {
				x *= pos.remove(pos.size()-1);
			}
			ans += x;
		}
		
		while (!neg.isEmpty()) {
			long x = neg.remove(0);
			if (!neg.isEmpty()) {
				x *= neg.remove(0);
			}
			ans += x;
		}
		
		System.out.println(ans);
	}

}
