import java.io.*;
import java.util.*;
public class LLusecase {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println(list);
        if (list.contains(30)) {
            System.out.println("list contains the value");
        }
    }
}
