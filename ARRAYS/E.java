import java.util.Scanner;

class H{
     public static void main (String [ ] args ){
          int [ ]  x = new int[ 3 ];

          Scanner s = new Scanner(System.in);
          
          for(int i = 0; i < x.length; i++){
               x[ i ] = s.nextInt();

          }
          s.close();

          System.out.println("++++++++++++++++");

          for(int i = 0; i <x.length ; i++){
               System.out.println(x[ i ]);
          }
     }
}