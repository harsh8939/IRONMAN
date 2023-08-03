import java.util.TreeSet;

class L {
     public static void main(String[] args){
          TreeSet<Employee> x new TreeSet<Employee>();

          x.add(new Employee(name:"mohan", age:12));
          x.add(new Employee(name:"rohan", age:14));
          x.add(new Employee(name:"tohan", age:10));
          x.add(new Employee(name:"gohan", age:5));
          x.add(new Employee(name:"kohan", age:9));

          System.out.println(x);


     }
     
}
class Employee{
     String name;
     int age;

     Employee(String name, int age){
          this.name = name;
          this.age = age;
     }
     public String toString(){
          return name +" - "+ age;
     }
}
