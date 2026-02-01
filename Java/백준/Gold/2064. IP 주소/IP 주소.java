import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		long[] ip = new long[n];

		for (int i = 0; i < n; i++) {
			String S = br.readLine();
			String[] split = S.split("\\.");

			long l = 0;

			for (int j = 0; j < 4; j++) {
				l += Long.parseLong(split[j]) << 8 * (3 - j);
			}

			ip[i] = l;
		}

		Arrays.sort(ip);

		long max = ip[n - 1];
		long min = ip[0];
		
		long full = (long) Math.pow(2, 32) - 1;

		int prefix = 32 - (int)(Math.floor(Math.log(max ^ min) / Math.log(2)) + 1);
		
		long mask = (full << (32 - prefix)) & full;
		long network = min & mask;

		System.out.println(ltoip(network));
		System.out.println(ltoip(mask));
	}

	static String ltoip(long l) {
		long a = (l >> 24) & 255;
		long b = (l >> 16) & 255;
		long c = (l >> 8) & 255;
		long d = l & 255;
		return String.format("%d.%d.%d.%d", a, b, c, d);
	}
}
