
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        boolean temp = false;

        while(true) {
            str = br.readLine();

            if(str.charAt(0) == '0') break;

            for(int i = 0; i < str.length() / 2; i++) {
                if(str.charAt(i) == str.charAt(str.length() - i - 1)) {
                    temp = true;
                }
                else {
                    temp = false;
                    break;
                }
            }

            if(str.length() == 1)
                temp = true;

            if(temp)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
