import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        // fill 2-dim array
        int[][] matrix = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] = Math.abs(j - i);
            }
        }

        // print 2-dim array
        for (int[] m : matrix) {
            for (int n : m) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}