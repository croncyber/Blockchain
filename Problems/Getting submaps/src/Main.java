import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int size = scanner.nextInt();

        Map<Integer, String> map = new TreeMap<>();

        for (int i = 0; i < size; i++) {
            map.put(scanner.nextInt(), scanner.nextLine().trim());
        }

        map.entrySet()
                .stream()
                .filter(integerStringEntry ->
                integerStringEntry.getKey() >= start && integerStringEntry.getKey() <= end
        ).forEach(integerStringEntry -> {
            System.out.println(integerStringEntry.getKey() + " " + integerStringEntry.getValue());
        });
        // put your code here
    }
}