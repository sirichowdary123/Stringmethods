import java.util.Scanner;
import java.util.*;
public class Equal1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        if(str1.equals(str2)){
            System.out.println("two strings are equal");
            
        }
        else{
            System.out.println("two strings are not equal");
        }
    }
}