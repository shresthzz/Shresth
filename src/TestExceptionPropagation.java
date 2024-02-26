import java.io.IOException;
import java.io.*;
import java.sql.SQLOutput;

public class TestExceptionPropagation
{
    void m() throws IOException{
        throw new java.io.IOException("device error");
    }
    void n() throws IOException{
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e)
        {
            System.out.println("exception handeled");
        }
    }
    public static void main(String args[]){
        TestExceptionPropagation obj=new TestExceptionPropagation();
        obj.p();
        System.out.println("normal flow");

    }
}