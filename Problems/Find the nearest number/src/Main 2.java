import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (String s : strings) {
            arrayList.add(Integer.parseInt(s));
        }
        int find = scanner.nextInt();

        ArrayList<Integer> g = new ArrayList<>();


        for (Integer i : arrayList) {
            g.add(Math.abs(find - i));
        }

        int min = Collections.min(g);
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            if (g.get(i) == min) {
                result.add(arrayList.get(i));
            }
        }

        Collections.sort(result);

        result.forEach(integer -> System.out.print(integer + " "));

        // write your code here
    }
}