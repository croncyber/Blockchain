import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordCount = scanner.nextInt();

        Set<String> words = new TreeSet<>();

        for (int i = 0; i <= wordCount; i++) {
            words.add(scanner.nextLine().trim().toLowerCase());
        }

        int lineCount = scanner.nextInt();

        Set<String> result = new TreeSet<>();

        for (int i = 0; i <= lineCount; i++) {
            result.addAll(Arrays.asList(scanner.nextLine().toLowerCase().split(" ")));
        }

        result.removeAll(words);
        result.forEach(System.out::println);


    }
}