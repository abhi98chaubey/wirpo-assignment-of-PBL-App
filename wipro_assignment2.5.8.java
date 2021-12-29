import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 ="";
        String str2 ="";
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)=='*'){
              str1 =  str.substring(0,i-1);
              str2 =  str.substring(i+2,str.length());

            }
        }
        System.out.println(str1+str2);
    }
}
