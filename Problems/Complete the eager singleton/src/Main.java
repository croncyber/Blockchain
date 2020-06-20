class SimpleCounter {
    private static SimpleCounter instance = new SimpleCounter();
    public int counter = 0;

    private SimpleCounter() {
        counter++;
    }

    public static SimpleCounter getInstance() {
        return instance;
    }
    // write your code here
}