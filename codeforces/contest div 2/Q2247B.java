import java.io.*;
import java.util.*;

public class Q2247B {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            long m = Long.parseLong(st.nextToken());

            if ((long) k > m) {
                out.append("NO\n");
                continue;
            }

            out.append("YES\n");

            for (int i = 1; i <= n; i++) {
                long prev = (i - 1L) % k;
                long cur = i % k;

                long val = (cur - prev + m) % m;
                if (val == 0) val = m;

                out.append(val);
                if (i != n) out.append(' ');
            }
            out.append('\n');
        }

        System.out.print(out);
    }
}