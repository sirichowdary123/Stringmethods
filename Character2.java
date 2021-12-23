import java.util.Scanner;
import java.util.*;
public class Character2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count=0;
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i) == 's'){
             count++;
            }
        }
        System.out.println(count);
    }
}
