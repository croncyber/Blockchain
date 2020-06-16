import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        String s = null;
        while (true) {
            try {
                s = scanner.nextLine();
                int num = Integer.parseInt(s);
                if (num == 0) {
                    break;
                } else {
                    int result = num * 10;
                    stringList.add(String.valueOf(result));
                }
            } catch (NumberFormatException e) {
                stringList.add("Invalid user input: " + s);
            }
        }
        stringList.forEach(System.out::println);
    }
}