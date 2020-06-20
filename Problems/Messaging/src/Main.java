import java.util.concurrent.*;

/* Do not change this class */
class Message {
    final String text;
    final String from;
    final String to;

    Message(String from, String to, String text) {
        this.text = text;
        this.from = from;
        this.to = to;
    }
}

/* Do not change this interface */
interface AsyncMessageSender {
    void sendMessages(Message[] messages);

    void stop();
}

class AsyncMessageSenderImpl implements AsyncMessageSender {
    private ExecutorService executor; // TODO initialize the executor
    private final int repeatFactor;

    public AsyncMessageSenderImpl(int repeatFactor) {
        this.repeatFactor = repeatFactor;
    }

    @Override
    public void sendMessages(Message[] messages) {
        executor = Executors.newSingleThreadExecutor();
        for (Message msg : messages) {
            for (int i = 0; i < repeatFactor; i++) {
                executor.submit(() -> {
                    System.out.printf("(%s>%s): %s\n", msg.from, msg.to, msg.text); // do not change it
                });
            }
        }


    }

    @Override
    public void stop() {
        executor.shutdown();
    }

    public void notifyAboutEnd() {

        try {
            if (executor.awaitTermination(100, TimeUnit.MILLISECONDS)) {
                System.out.println("Completed.");
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted...");
        }
    }


}

/*
class Test {
    public static void main(String[] args){
        AsyncMessageSenderImpl sender = new AsyncMessageSenderImpl(3);

        Message[] messages = {
                new Message("John", "Mary", "Hello!"),
                new Message("Clara", "Bruce", "How are you today?")
        };

        sender.sendMessages(messages);
        sender.stop();
        sender.notifyAboutEnd();

    }
}*/
