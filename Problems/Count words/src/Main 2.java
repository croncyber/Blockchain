import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(reader.readLine());
        String[] strings = stringBuilder.toString().split(" ");
        int count = 0;
        for (String s : strings) {
            s.trim();
            if (!s.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);

        reader.close();
    }
}