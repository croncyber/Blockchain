import java.util.*;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        int k = n - (a + b + c);

        Random random = new Random();

        StringBuilder stringBuilder = new StringBuilder();

        boolean check = true;
        while (check) {
            random.ints(1, 65, 90).forEach(e -> stringBuilder.append((char) e));
            random.ints(1, 97, 122).forEach(e -> stringBuilder.append((char) e));
            random.ints(1, 0, 10).forEach(e -> stringBuilder.append(e));
            random.ints(1, 65, 90).forEach(e -> stringBuilder.append((char) e));

            UnaryOperator<List<Character>> unaryOperator = x -> new ArrayList<>(new HashSet<>(x));

        }

        System.out.println(stringBuilder.toString());
    }
}