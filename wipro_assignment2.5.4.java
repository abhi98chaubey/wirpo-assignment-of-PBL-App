import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length()%2==0){
            System.out.println(str.substring(0,str.length()/2));
        }else{
            System.out.println("null");
        }
    }
}