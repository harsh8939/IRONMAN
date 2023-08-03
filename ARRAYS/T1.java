class T1{
     public static void main (String[] args){
          byte b = 23;
          short s = 345;
          char c = 'A';
          int i =  9;
          long l = 6L; 
          float f = 3.4f;
          double d = 3.4f;


          int[ ] x = { b, s, c, i, (int)l,(int)f, (int)d};

          for(int a : x){
               System.out.println(a);
          }
     }

}