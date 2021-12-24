import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char colorcode = sc.next().charAt(0);
        if(colorcode==W){
            System.out.println("White");
        }else if(colorcode==R){
            System.out.println("Red");
        }else if(colorcode==Y){
            System.out.println("Yellow");
        }else if(colorcode==G){
            System.out.println("Green");
        }else if(colorcode==O){
            System.out.println("Orange");
        }else{
            System.out.println("Invalid Code");
        }
        
    }
}
