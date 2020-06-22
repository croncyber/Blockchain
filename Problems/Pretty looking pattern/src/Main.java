import java.util.*;

public class Main {

    public static String consistsSameColor(char[][] matrix) {

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[i][j] == matrix[i][j + 1] & matrix[i][j] == matrix[i + 1][j]
                        & matrix[i][j] == matrix[i + 1][j + 1]) {
                    return "NO";
                }
            }
        }

        return "YES";
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       /* char[][] matrix = new char[4][];
        int v = 0;
        for (char[] chars : matrix) {
            matrix[v++] = scanner.nextLine().toCharArray();

        }*/


        char[] firstLine = scanner.nextLine().toCharArray();
        char[] secondLine = scanner.nextLine().toCharArray();
        char[] thirdLine = scanner.nextLine().toCharArray();
        char[] fourthLine = scanner.nextLine().toCharArray();

        char[][] matrix = {firstLine, secondLine, thirdLine, fourthLine};

        System.out.println(consistsSameColor(matrix));
    }
}