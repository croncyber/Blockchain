class NumbersThread extends Thread {

    private int from;
    private final int to;

    public NumbersThread(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        while (from <= to) {
            System.out.println(from++);
        }
    }
}