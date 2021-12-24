import java.util.*;
 class Main {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String gender = sc.next();
            int age = sc.nextInt();
            if(gender == Female && 1<=age<=58){
                System.out.print("8.2%");
            }else if(gender == Female && 59<=age<=100) {
                System.out.print("9.2%");
                
            }else if(gender == Male && 1<=age<=58) {
                System.out.print("8.4%");
                
            }else if(gender == Male && 59<=age<=100) {
                System.out.print("10.5%");
                
            }
            
        }
    }
