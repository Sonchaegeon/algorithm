import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] str = new char[n][m];
        char first;
        int result = 999999999, temp1 = 0, temp2 = 0, temp = 0;

        for(int i = 0; i < n; i++) {
            str[i] = br.readLine().toCharArray();
        }

        first = str[0][0];

        for(int i = 0; i < n - 7; i++) {
            for(int j = 0; j < m - 7; j++) {
                for(int k = i; k < 8 + i; k++) {
                    for(int l = j; l < 8 + j; l++) {
                        if(l % 2 == 0) {
                            if(str[k][l] != first) temp1++;
                        }
                        else {
                            if(str[k][l] == first) temp1++;
                        }
                    }
                    if(first == 'B') first = 'W';
                    else first = 'B';
                }
                for(int k = i; k < 8 + i; k++) {
                    for(int l = j; l < 8 + j; l++) {
                        if(l % 2 == 0) {
                            if(str[k][l] == first) temp2++;
                        }
                        else {
                            if(str[k][l] != first) temp2++;
                        }
                    }
                    if(first == 'B') first = 'W';
                    else first = 'B';
                }
                if(temp1 > temp2) temp = temp2;
                else temp = temp1;

                if(result > temp) result = temp;
                temp1 = 0;
                temp2 = 0;
                if(first == 'B') first = 'W';
                else first = 'B';
            }
            if(first == 'B') first = 'W';
            else first = 'B';
        }

        System.out.println(result);
    }
}
