class SharedData {
    private int data;
    private boolean isDataAvailable = false;

    // Method to consume data
    public synchronized int consume() {
        while (!isDataAvailable) {
            try {
                wait();  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isDataAvailable = false;  
        notify();  
        return data;
    }

   
    public synchronized void produce(int newData) {
        while (isDataAvailable) {
            try {
                wait(); 
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = newData;
        isDataAvailable = true;  
        notify(); 
    }
}

class Producer extends Thread {
    private SharedData sharedData;

    public Producer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            sharedData.produce(i);  
            
            System.out.println("Produced: " + i);
            try {
                Thread.sleep(1000);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private SharedData sharedData;

    public Consumer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            int data = sharedData.consume();  
            
            System.out.println("Consumed: " + data);
            try {
                Thread.sleep(1500);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class P37 {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        Producer producer = new Producer(sharedData);
        Consumer consumer = new Consumer(sharedData);

        producer.start();
        consumer.start();
    }
}
