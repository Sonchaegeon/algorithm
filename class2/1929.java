import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[] arr = new boolean[m + 1];

        arr[0] = arr[1] = true;

        for(int i = 2; i < Math.sqrt(arr.length); i++) {
            if(arr[i]) continue;
            for(int j = i * i; j < arr.length; j+=i) {
                arr[j] = true;
            }
        }

        for(int i = n; i <= m; i++) {
            if(!arr[i]) System.out.println(i);
        }
    }
}
