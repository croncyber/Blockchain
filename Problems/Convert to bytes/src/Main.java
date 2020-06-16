import java.io.InputStream;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        byte[] bytes = inputStream.readAllBytes();;
//        while (inputStream.read() != -1) {
//
//        }
        for (byte b:bytes) {
            System.out.print(b);
        }
//        inputStream.close();
    }
}