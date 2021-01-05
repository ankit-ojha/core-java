package Threading;

public class ExtendThreadClassExample extends Thread {
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        ExtendThreadClassExample obj = new ExtendThreadClassExample();
        obj.start();
    }
}
