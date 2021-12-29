import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String finalAns = str.substring(1,str.length());
        System.out.println(finalAns);
    }
}