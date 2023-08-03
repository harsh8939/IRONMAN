class LivingBeing {   }
class Human extends LivingBeing { }
class Animal extends LivingBeing {   }
class Cat extends Animal {   }
class Cow extends Animal {   }
class Dog extends Animal {   }
class BDog extends Dog {   }

class U1 {
    public static void main(String[] args) {
        BDog bd = new BDog();
        Dog d = new Dog();
        Cat c = new Cat();
        Cow w = new Cow();
        Animal a = new Animal();
        LivingBeing lb = new BDog();

         Animal[] x = {bd, d, c, w, a, (Animal)lb};
        Animal[] y = {bd, d, c, w, a, (Dog)lb};
        Animal[] z = {bd, d, c, w, a, (BDog)lb};

        for(Animal animal : x) {
            System.out.println(animal);
        }
    }
}