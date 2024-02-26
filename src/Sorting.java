import java.io.*;
import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(20);
        arr.add(30);
        arr.add(23);
        arr.add(28);



        System.out.println(arr);
        System.out.println("Ascending order:");
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println("----------");

        arr.set(2,40);
        int val=arr.get(0);
        System.out.println(arr);
        System.out.println(val);
        System.out.println("----------");


        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);
    }
}
