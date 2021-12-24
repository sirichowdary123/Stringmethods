import java.util.Scanner;
import java.util.*;
public class Getbyte {
    public static void main(String args[]){
        String str = "ABCDEF";
        byte[] barr = str.getBytes();  
        for(int i=0;i<barr.length;i++){  
            System.out.println(barr[i]);  
        }  
           
        String s2 = new String(barr);  
        System.out.println(s2);  
    }
}
