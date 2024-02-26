import java.io.*;
public class TestExceptionPropagation2 {
    void m() throws IOException{
        int c=10+20;
        someothermethod();
        throw new java.io.IOException("device error");
    }

    private void someothermethod() {
        int j=20+50;
        for(int i=0;i<3;i++)
        {
            int k=i+j;
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestExceptionPropagation2 ob=new TestExceptionPropagation2();
        try {
            ob.m();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
