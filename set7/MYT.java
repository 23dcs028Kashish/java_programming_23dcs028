public class MYT implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("even: " + i);
            } else {
                System.out.println("odd: " + i);
            }

            // Handle InterruptedException properly
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        MYT t1 = new MYT();
        Thread t = new Thread(t1);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("kashish");
            Thread.sleep(1000);
        }
    }
}
