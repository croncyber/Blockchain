class MessageNotifier extends Thread {
    private String msg;
    private int repeats;

    public MessageNotifier(String msg, int repeats) {
        this.msg = msg;
        this.repeats = repeats;
    }

    @Override
    public void run() {
//        for (int i = repeats; i > 0; i--) {
//            System.out.println(this.msg);
//        }

        while (repeats-- > 0) {
            System.out.println(this.msg);
        }
    }

}