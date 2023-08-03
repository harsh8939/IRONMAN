class LivingBeing{}
class Animal extends LivingBeing{ }
class Cat extends Animal{ }
class Cow extends Animal{ }
class Dog extends Animal{ }
class BDog extends Dog{  }

class U{
     public static void main(String [] args){
          BDog bd = new BDog();
          Dog d = new Dog();
          Cat c = new Cat();
          Cow  w = new Cow();
          Animal a = new Animal ();

          Animal[] x = { bd, d, c, w, a};


          for(Animal animal : x ){
               System.out.println (animal);
          }
     }
}