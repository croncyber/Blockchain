import java.util.Scanner;

class Main {
public static void decomposition(int n, int m){
    while (m<0){
        for (int i = 0; i < m; i++) {
            System.out.print((n-m)+" ");
        }
    }

}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        decomposition(n,5);
        // put your code here
    }
}