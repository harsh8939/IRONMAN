import java.util.ArrayList;

class F1 {
     public static void main(String[] args){
          ArrayList x = new ArrayList();

          x.add("Raju");
          x.add("Bheem");
          x.add("Chhutki");
          x.add("Jaggu");
          x.add("Kaliya");

          System.out.println(x);

          //String y = x.get(2);
          String y  =  (String)x.get(2);

          System.out.println(y);

          System.out.println(x);

    }
}

