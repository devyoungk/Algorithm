import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		Map<Integer, Integer> map = new LinkedHashMap<>();
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(st.nextToken());
			
			if (map.containsKey(x))
				map.replace(x, map.get(x)+1);
			else 
				map.put(x, 1);
		}
		
		List<Map.Entry<Integer, Integer>> L = new ArrayList<>(map.entrySet());
		
		L.sort((a, b) -> b.getValue() - a.getValue());
		
		StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Integer> e : L) {
            int k = e.getKey();
            int v = e.getValue();
            for (int i = 0; i < v; i++) 
            	sb.append(k).append(" ");
        }

        System.out.print(sb);
	}
}
