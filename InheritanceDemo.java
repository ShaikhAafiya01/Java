class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }

    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void run() {
        System.out.println("Dog runs");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.sound();
        d.run();
    }
}
