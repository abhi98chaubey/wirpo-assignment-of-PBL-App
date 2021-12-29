import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i=0;i<n;i++){
           arr[i] = sc.nextInt(); 
        }
        int max=0;
        int maxfreq = arr[0];
        for (int i=0;i<n;i++){
            int count = 0;
            for (int j=0;j<n;j++){
               if(arr[i] == arr[j]){
                   count++;
               }
            }
            if(max<count){
                maxfreq = arr[i];
            }
            max = count;
        }
        
            System.out.println(maxfreq);
        
    }
}