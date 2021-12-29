import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int [] arr = new int[n*n];
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        if(n == 3){
        int greater_number = arr[0];
        for (int i = 0; i<arr.length; i++){
            if(greater_number < arr[i]){
                greater_number = arr[i];
            }
        }
            System.out.println(greater_number);
        }else{
           System.out.println("please enter 9 integer number" );
        }
    }
}