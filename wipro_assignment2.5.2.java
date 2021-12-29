import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        str1.toLowerCase();
        str2.toLowerCase();
        System.out.println(str1 + str2);
    }
}
