class G{
     public static void main(String[ ] args ){
          int [ ] x = new int[ 5 ];

          x[ 0 ] =  78;
          x[ 1 ] =  99;
          x[ 2 ] =  2;
          x[ 3 ] =  32;
          x[ 4 ] =  45;

          for(int i = x.length - 1; i >= 0; i--){
             //  System.out.println( i );
               System.out.println(x[ i ]); 
          }

     }
}