public class Mythraad extends Thread{
    String n;
    int m;
    public Mythraad(String name, int i) {
        n=name;
        m=i;
    }

    public Mythraad() {
        n=null;
        m=0;
    }

    @Override
    public void run() {
        for(int i=0;i<3;i++)
        {
            System.out.println("Thread1 is running");
        }
    }
}

