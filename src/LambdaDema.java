public class LambdaDema {
    public static void main(String[] args) {
        Sayyable ob=new Sayyable();
        ob.say();


        LambdaInterface s1= () -> {
            System.out.println("you saying something");
        };
        s1.say();
    }
}
