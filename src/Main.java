class Person {
    public static void greet() {
        System.out.println();
    }

    public void sayHello() {
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Person.greet();

        Person p = new Person();
        p.sayHello();
    }
}