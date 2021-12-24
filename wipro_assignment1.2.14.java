import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        // if count i s greater then 0 then number is not Prime
        if(number == 1 || number == 0){
            System.out.println(number  + " is neither prime nor composite")
        }
        for (int i =2;i<=number/2;i++){
            if(number/i==0){
                // if any number divede this number count is increase
                count++;
                System.out.println(number + " is Not Prime number");
            }
        }
        if(count==0){
            System.out.println(number + " is a Prime number");
        }
    }
}