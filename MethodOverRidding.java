class Animal{
    public void sound(){
        System.out.println("Generic Animal Noises");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Dog Barks -- Woof!!");
    }
}

public class MethodOverRidding{
    public static void main(String[] args){
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.sound();
        dog.sound();

        Animal animalDog = new Dog();
        animalDog.sound();
    }
}
