import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StringProcessor extends Thread {

    final Scanner scanner = new Scanner(System.in); // use it to read string from the standard input

    @Override
    public void run() {
        List<String> stringList = new ArrayList<>();
        while (true) {
            String s = scanner.nextLine();
            if (s.compareTo(s.toUpperCase()) == 0) {
                stringList.forEach(System.out::println);
                System.out.println("FINISHED");
            } else {
                stringList.add(s.toUpperCase());
            }
        }


        // implement this method
    }
}