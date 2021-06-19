import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[8];
        String result = "";

        for(int i = 0; i < 8; i++) {
            input[i] = sc.nextInt();
        }

        for(int i = 0; i < 7; i++) {
            if(input[i] == input[i + 1] - 1)
                result = "ascending";
            else if(input[i] == input[i + 1] + 1)
                result = "descending";
            else {
                result = "mixed";
                break;
            }
        }

        System.out.println(result);
    }
}
