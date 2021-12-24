import java.io.*;
import java.util.*;
public class Main {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int number1 = sc.nextInt();
            if(number1>0){
                System.out.print("number is Positive");
            }else if(number1==0){
                System.out.print("number is Zero");
            }else{
                System.out.print("number is Negative");
            }
           
        }
    }
