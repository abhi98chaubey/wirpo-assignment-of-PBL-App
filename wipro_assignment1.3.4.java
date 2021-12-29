import java.io.*;
import java.util.*;


        //ASCII Value of digits 48-57

		//ASCII Value of UpperCase Character 65-90

		//ASCII Value of LowerCase Character 97-122

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<arr.length; i++) {
            System.out.print((char)arr[i]+" ");
        }
        System.out.println();
    }
}