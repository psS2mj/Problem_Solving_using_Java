import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class D3_3376_파도반수열 {
 
    static int T, N;
    static long[] pado = new long[101];
 
    public static void main(String[] args) throws NumberFormatException, IOException {
        pado[0] = 1;
        pado[1] = 1;
        pado[2] = 1;
        for (int i = 3; i < pado.length; i++) {
            pado[i] = pado[i-3] + pado[i-2];
        }
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());
            System.out.println("#" + tc + " " + pado[N - 1]);
        }
    }
}