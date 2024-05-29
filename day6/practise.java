import day18.Animal;
import day18.Dog;

class Animal{
  public void eat(){
    System.out.println("Animal is eating :");
  }
  class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is a barking :");
    }
    public void sound(){ 
        System.out.println("Dog is make sound :");
    }
  }
}

public class practise {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
       Dog dog = new Dog();
       dog.bark();
       dog.sound();

    }
}
