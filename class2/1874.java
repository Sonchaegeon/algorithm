import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> inputs = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        int i = 0, target = 0;

        for(i = 0; i < n; i++) {
            inputs.add(Integer.parseInt(br.readLine()));
        }

        i = 1;
        while((i - 1 < n) || !stack.isEmpty()) {
            if(!stack.isEmpty() && (stack.peek() == inputs.get(target).intValue())) {
                stack.pop().intValue();
                str.add("-");
                target++;

                continue;
            }

            if(i - 1 < n) {
                stack.push(i).intValue();
                str.add("+");

                i++;

            } else {
                System.out.println("NO");
                str.clear();
                break;
            }
        }

        if(!str.isEmpty()) {
            for(i = 0; i < str.size(); i++) {
                System.out.println(str.get(i));
            }
        }
    }
}
