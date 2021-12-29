import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int secondmax = arr[0];
        int min = arr[0];
        int secondmin = arr[0];


        for (int i = 0; i < arr.length; i++)
        {
                if (arr[i] > max)
                {
                        secondmax = max;
                        max = arr[i];
                }
                else if (arr[i] > secondmax)
                {
                        secondmax = arr[i];
                }
        }
        for (int i = 0; i < arr.length; i++)
        {
                if (arr[i] < min)
                {
                        secondmin = min;
                        min = arr[i];
                    }
                    else if (arr[i] < secondmin)
                    {
                            secondmin = arr[i];
                    }
            }
            System.out.println("\n maximum number is: " + max);
            System.out.println("\n Second maximum number is: " + secondmax);
            System.out.println("\n minimum number is: " + min);
            System.out.println("\n Second minimum number is: " + secondmin);

    }
}