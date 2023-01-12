public class ThreadSam extends Thread{
    int i;
    int j;
    void update() throws InterruptedException {
        for ( i=1 ; i<=5 ; i++ ) {
            System.out.println("Updating....");
//            try {
//                System.out.println("Delay")
                Thread.sleep(1000);
//            } catch (Exception e) {
//            }
        }
    }

}
