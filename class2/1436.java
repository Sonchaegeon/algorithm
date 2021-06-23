import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer result = 665;
        int temp = 0;
        int n = sc.nextInt();

        while(true) {
            ++result;
            if(result.toString().contains("666")) {
                temp++;
            }

            if(temp == n) break;
        }
        System.out.println(result);
    }
}
