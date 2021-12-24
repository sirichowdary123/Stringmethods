import java.util.Scanner;
import java.util.*;
public class Ignore {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("The two strings are equal");
        }
        else{
            System.out.println("The two strings are not equal");
        }
    }
}
