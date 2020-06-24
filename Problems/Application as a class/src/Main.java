class Application {
    public static long method(long n) {
        if (n <= 1) {
            return n;
        }
        return n + method(n - 1) - 1;
    }

    public static void main(String[] args) {
        System.out.println(method(7));
    }

    String name;

    void run(String[] args) {
        System.out.println(name);
        for (String s : args) {
            System.out.println(s);

        }
    }
}