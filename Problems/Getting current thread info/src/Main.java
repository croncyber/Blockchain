class Info {

    public static void printCurrentThreadInfo() {
        System.out.println("name: " + Thread.currentThread().getName() + "\n" + "priority: " + Thread.currentThread().getPriority());
    }

}