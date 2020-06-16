
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        char prev = s.charAt(0);
        stringBuilder.append(chars[0]);
        for (char c : chars) {
            if (c == prev) {
                i++;
            } else {
                stringBuilder.append(i);
                stringBuilder.append(c);
                i = 1;
                prev = c;
            }
        }
        stringBuilder.append(i);

        System.out.println(stringBuilder.toString());


    }
}