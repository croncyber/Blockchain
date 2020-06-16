import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(reader.readLine());
        System.out.println(stringBuilder.reverse().toString());
        reader.close();
    }
}