import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int monthnumber = sc.nextInt();

        //print name of months
        if(monthnumber==1){
            System.out.println("January");
        }else if(monthnumber==2){
            System.out.println("February");
        }else if(monthnumber==3){
            System.out.println("March");
        }else if(monthnumber==4){
            System.out.println("April");
        }else if(monthnumber==5){
            System.out.println("May");
        }else if(monthnumber==6){
            System.out.println("June");
        }else if(monthnumber==7){
            System.out.println("July");
        }else if(monthnumber==8){
            System.out.println("August");
        }else if(monthnumber==9){
            System.out.println("September");
        }else if(monthnumber==10){
            System.out.println("October");
        }else if(monthnumber==11){
            System.out.println("November");
        }else if(monthnumber==12){
            System.out.println("December");
        }
        else{
            System.out.println("Invalid month");
        }
        
    }
}
