class O{
     public static void main (String args){
          int x = 2, y = 3, z;

          System.out.println(x + "-" + y);

          x  = x + y;
          y  = x - y;
          x  = x - y;
          
          System.out.println(x + "-" + y);
     }
}