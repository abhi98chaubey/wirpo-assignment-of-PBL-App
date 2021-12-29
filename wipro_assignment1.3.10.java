import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[4];
        for (int i =0; i<4; i++){
            arr[i] = sc.nextInt();
        } 
        int i = 0;
        int j = 3;
        while(i==j)  {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = arr[j];
            i++;
            j--;
            
        } 
        
        System.out.println(arr[0] + " " + arr[1]);
        System.out.println(arr[2] + " " + arr[3]);

      
    }
}
