import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.charAt(0)== 'x'){
            str.substring(1);
        }
        if(str.charAt(str.length())== 'x'){
            str.substring(0,str.length()-1);
        }
        System.out.println(str);
    }
}