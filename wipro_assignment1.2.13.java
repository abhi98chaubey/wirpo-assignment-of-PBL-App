import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
   
     int num = 99, count;
   
     for (int i = 10; i <= num; i++) {
      count = 0;
      for (int j = 2; j <= i / 2; j++) {
       if (i % j == 0) {
        count++;
        break;
       }
      }
   
      if (count == 0) {
       System.out.println(i);
      }
   
     }
    }
   }
   