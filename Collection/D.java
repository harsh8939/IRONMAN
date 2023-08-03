import java.util.ArrayList;
class D {
     public static void main(String [] args){
          ArrayList x = new ArrayList();

          x.add("Raju");
          x.add("Bheem");
          x.add("Chhuki");
          x.add("Jaggu");
          x.add("Kaliya");

          System.out.println(x);

          String t = "bheem";

          //String t = "Dholu";

          boolean f = x.remove(t);

          System.out.println(f);

     }
     
}
