public class P32 {

    
    static class P32B extends Thread {
        @Override
        public void run() {
            System.out.println("Hello World from Thread class!!");
        }
    }

    
    static class P32A implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello World from Runnable interface!!");
            
        }
    }

    public static void main(String[] args) {
        
        P32B thread1 = new P32B();  
        thread1.start(); 

        
        P32A t1 = new P32A();
        Thread thread2 = new Thread(t1);
        thread2.start();  
    }
}
