import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 0; i < n; i++) {
            String word = br.readLine();
            boolean[] check = new boolean[26];
            int prev = 0;

            for(int j = 0; j < word.length(); j++) {
                int now = word.charAt(j);
                if(prev != now) {
                    if(!check[now - 'a']) {
                        check[now - 'a'] = true;
                        prev = now;
                    } else {
                        result--;
                        break;
                    }
                }
            }
            result++;
        }

        System.out.println(result);
    }
}
