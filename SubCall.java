class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }

    void wagTail(){
        System.out.println("Dog wag tails");
    }
}


public class SubCall {
    public static void main(String[] args) {
        Animal obj = new Dog(); // Super class reference, subclass object
        obj.sound(); 

        //obj.wagTail(); // compile time error: not in animal
    }
}
