import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toLowerCase().toCharArray();
        int i = 0;
        for (char c : chars) {
            if (c == 'g' || c == 'c') {
                i++;
            }
        }

        double result = ((double)i/chars.length) * 100;
        System.out.println(result);
        // put your code here
    }
}