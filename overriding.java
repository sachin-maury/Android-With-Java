
    class Animal{
        public void eat(){
            System.out.println("The cow is eating :");
        } 
        }
        class Dog extends Animal{
            public void bark(){
                System.out.println("The dog is barking");
            }
            public void eat(){
                System.out.println("Dog is eating ");
            }
        
        }
        public class overriding {
        public static void main(String[] args) {
            Animal animal = new Animal();
            Dog dog = new Dog();
            animal.eat();
            dog.bark();
            dog.eat();
        
    }

    
}
