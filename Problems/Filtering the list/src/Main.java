import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            if (i % 2 != 0) {
                resultList.add(integerList.get(i));
            }
        }
        Collections.reverse(resultList);
        resultList.forEach(integer -> System.out.print(integer + " "));
    }
}