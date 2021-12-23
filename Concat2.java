import java.util.Scanner;
import java.util.*;
public class Concat2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String s1 = str2.concat(" ").concat(str1);
        System.out.println(s1);
    }
}
