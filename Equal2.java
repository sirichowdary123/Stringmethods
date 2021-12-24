import java.util.Scanner;
import java.util.*;
public class Equal2{
    public static void main(String args[]){
        String s1 = "s";
        String s2 = "1";
        String s3 = "23.45";
        String s4 = "true";
        Character c = new Character('a');
        Integer i = new Integer(1);
        Float f = new Float(23.45);
        Boolean b = new Boolean(true);
        System.out.println(s1.equals(c));
        System.out.println(s2.equals(i));
        System.out.println(s3.equals(f));
        System.out.println(s4.equals(b));
        System.out.println(s1.equals(c.toString()));
        System.out.println(s2.equals(i.toString()));
        System.out.println(s3.equals(f.toString()));
        System.out.println(s4.equals(b.toString()));
    }
}
