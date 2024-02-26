public class ThreadDemo {
    public static void main(String[] args) {



//        Mythraad db=new Mythraad("dbThread",10);
//        Mythraad net=new Mythraad("network",100);
//        db.start();
//        net.start();



//        RunnableThead rthread = new RunnableThead();
//        Thread t1=new Thread(rthread);
//        t1.start();



//          Mythraad ob1=new Mythraad();
//          JoinThread ob2=new JoinThread();
//
//              ob2.start();
//              try{
//                  ob2.join();
//              }catch (Exception e)
//              {
//                  System.out.println(e);
//              }
//              ob1.start();


        DeamonThread t1=new DeamonThread();
        DeamonThread t2=new DeamonThread();
        t1.setDaemon(true);
        t1.start();
        t2.start();
    }
}
