//put imports you need here

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> guests = new Stack<>();
        String[] first = scanner.nextLine().split(" ");
        String[] second = scanner.nextLine().split(" ");
        String[] third = scanner.nextLine().split(" ");
        String[] fourth = scanner.nextLine().split(" ");

        guests.addAll(Arrays.asList(first));
        guests.addAll(Arrays.asList(second));
        guests.addAll(Arrays.asList(third));
        guests.addAll(Arrays.asList(fourth));

       while (!guests.isEmpty()){
           System.out.println(guests.pop());
       }


        // put your code here
    }
}