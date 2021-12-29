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
        int sum=0;
        for (int i=0;i<n;i++){
           if(arr[i] != 6){
               sum = sum + arr[i];
           }else if(arr[i] == 6){
               int j = i;
               while(j<=arr.length-1){
                   if(arr[j]==7){
                       i = j;
                   }else{
                       j++;
                   }
                }
                   sum = sum + arr[i];
               }
           }
           System.out.println(sum);
        }
    }

           