import java.util.TreeSet;

class p{
     public static void main(String[] args){
          TreeSet<Integer> x = new TreeSet<Integer>();

          x.add("mohan");
          x.add("tohan");
          x.add("rohan");
          x.add("gohan");
          x.add("sohan");
          System.out.println(x);

          String a = new String("rohan");

          System.out.println(x.contains(a));
     }
}
