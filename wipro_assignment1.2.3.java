import java.util.*;
 class Main {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String[] arr = new String[n];
            for(int i =0; i<n;i++){
                arr[i] = sc.next();
            } 
            if(arr[0] == null){
                System.out.prin("No Values");
           
            }else{
                System.out.print(arr[0]);
                for(int i = 1;i<n;i++){

                
                System.out.print("," + arr[i]);
            }}
           
        }
    }
