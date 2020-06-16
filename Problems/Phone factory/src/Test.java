import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Reader reader = new FileReader("kk");
        int current = reader.read();
        while (current != -1) {
            current = reader.read();
            System.out.println((char) current);
        }
        reader.close();
    }
}
