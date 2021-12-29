import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        str.substring(str.length()-n, str.length());
        for(int i =0;i<n;i++){
            System.out.print(str);
        }
    }
}

