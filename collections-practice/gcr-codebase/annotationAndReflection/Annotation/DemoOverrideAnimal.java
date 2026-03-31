public class DemoOverrideAnimal {
    public void makeSound(){
        System.out.println("Animal makes a sound");

    }
    public static void main(String[] args){
    DemoOverrideAnimal dog = new Dog();
    dog.makeSound();
    
}
    
    
}
class Dog extends DemoOverrideAnimal{
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
}

