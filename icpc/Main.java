import java.util.*;
public class Main {
    static final int MOD = 1000000007;

    static int modInverse(int a, int m) {
        int m0 = m, y = 0, x = 1;
        if (m == 1) return 0;
        while (a > 1) {
            int q = a / m;
            int t = m;
            m = a % m;
            a = t;
            t = y;
            y = x - q * y;
            x = t;
        }
        if (x < 0) x += m0;
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), d0 = sc.nextInt(), d1 = sc.nextInt(), d2 = sc.nextInt();
        char[][] g = new char[n][m];
        for (int i = 0; i < n; i++) g[i] = sc.next().toCharArray();

        long e = 0, f = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (g[i][j] == 'V') e += d0;
                else if (g[i][j] == '.') {
                    boolean adjV = false, crnV = false;
                    if (i > 0 && g[i - 1][j] == 'V') adjV = true;
                    if (i < n - 1 && g[i + 1][j] == 'V') adjV = true;
                    if (j > 0 && g[i][j - 1] == 'V') adjV = true;
                    if (j < m - 1 && g[i][j + 1] == 'V') adjV = true;

                    if (i > 0 && j > 0 && g[i - 1][j - 1] == 'V') crnV = true;
                    if (i > 0 && j < m - 1 && g[i - 1][j + 1] == 'V') crnV = true;
                    if (i < n - 1 && j > 0 && g[i + 1][j - 1] == 'V') crnV = true;
                    if (i < n - 1 && j < m - 1 && g[i + 1][j + 1] == 'V') crnV = true;

                    if (adjV) e += d1;
                    else if (crnV) e += d2;
                } else {
                    f++;
                    boolean adjV = false, crnV = false;
                    if (i > 0 && g[i - 1][j] == 'V') adjV = true;
                    if (i < n - 1 && g[i + 1][j] == 'V') adjV = true;
                    if (j > 0 && g[i][j - 1] == 'V') adjV = true;
                    if (j < m - 1 && g[i][j + 1] == 'V') adjV = true;

                    if (i > 0 && j > 0 && g[i - 1][j - 1] == 'V') crnV = true;
                    if (i > 0 && j < m - 1 && g[i - 1][j + 1] == 'V') crnV = true;
                    if (i < n - 1 && j > 0 && g[i + 1][j - 1] == 'V') crnV = true;
                    if (i < n - 1 && j < m - 1 && g[i + 1][j + 1] == 'V') crnV = true;

                    if (adjV) e += d1;
                    else if (crnV) e += d2;
                    e += d0;
                }
            }
        }

        long p = (e % MOD + f * d0 % MOD) % MOD;
        long q = (1L << f) % MOD;
        System.out.println(p * modInverse((int) q, MOD) % MOD);
    }
}