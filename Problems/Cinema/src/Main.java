import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // create matrix
        int rows = scanner.nextInt();
        int seats = scanner.nextInt();

        int[][] cinema = new int[rows][seats];

        // fill matrix '0' and '1'
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                cinema[i][j] = scanner.nextInt();
            }
        }

        // find the first ticket in the specified row
        int findTickets = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < rows; i++) {
            int count = 0;
            if (result > 0) {
                break;
            }

            for (int j = 0; j < seats; j++) {
                if (cinema[i][j] == 0) {
                    count++;
                    if (findTickets == count) {
                        result = i + 1;
                        break;
                    }
                } else count = 0;
            }
        }

        System.out.println(result);

    }
}



