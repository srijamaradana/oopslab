
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat meows: Meow Meow");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}
