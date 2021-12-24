import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 2*3*5;
        for(int i=0;i<5;i++){
            for(int j=count;j<1000;j++){
                if(j%2==0 && j%3==0 && j%5==0){
                    count = j;
                    System.out.println(count);
                }
            }
        }
    }
}