public class DeamonThread extends Thread{
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("deamon thread");
        }
        else
        {
            System.out.println("normal thread");
        }
    }
}
