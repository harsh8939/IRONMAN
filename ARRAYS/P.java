class Employee {
     String name;
     int age;
     Address address;
 
     Employee(String name, int age, Address address) {
         this.name = name;
         this.age = age;
         this.address = address;
     }
 }
 
 class Address  {
     City city;
     State state;
 
     Address(City city, State state) {
         this.city = city;
         this.state = state;
     }
 }
 
 class City {
     String cityName;
 
     City(String cityName) {
         this.cityName = cityName;
     }
 }
 
 class State {
     String stateName;
 
     State(String stateName) {
         this.stateName = stateName;
     }
 }
 
 class P {
     public static void main(String[] args) {
         Employee[] x = {
             new Employee("om", 32, new Address(new City("Jbp"), new State("MP"))),
             new Employee("ram", 45, new Address(new City("Jaip"), new State("RJ"))),
             new Employee("golu", 28, new Address(new City("Pune"), new State("MH"))),
         };
 
         for(int i=0; i < x.length; i++) {
             // System.out.println(i);
             // System.out.println(x[i]);
             // System.out.println(x[i].name);
             // System.out.println(x[i].address);
             // System.out.println(x[i].address.state);
             // System.out.println(x[i].address.state.stateName);
             System.out.println(x[i].address.state.stateName + " - " + x[i].address.city.cityName);
         }
     }    
 }