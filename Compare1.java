import java.util.Scanner;
import java.util.*;
public class Compare1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));
    }

}
