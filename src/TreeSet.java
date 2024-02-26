import java.util.*;
import java.util.Set;
import java.io.*;
public class TreeSet {
        public static void main(String args[]){
            Set<String> al = new java.util.TreeSet<>();
            al.add("Ravi");
            al.add("Vijay");
            al.add("Ravi");
            al.add("Ajay");
            Iterator<String> itr=al.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
}
