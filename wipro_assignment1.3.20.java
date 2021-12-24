import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println("chose 1 for addition and 2 for Subtraction");
        int option = sc.nextInt();
        if(option == 1){
            System.out.println(number1+number2); 
        }else if(option==2){
            System.out.println(number1-number2);
        }else{
            System.out.println("please enter valied option");
        }
