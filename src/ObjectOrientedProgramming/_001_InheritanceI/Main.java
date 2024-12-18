package ObjectOrientedProgramming._001_InheritanceI;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sign();
    }
}

class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }

    void sign() {
        System.out.println("I am singing");
    }
}