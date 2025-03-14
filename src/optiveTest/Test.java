package optiveTest;

class Animal {
    int x = 20;

    Animal() {
        System.out.println("Animal Constructor");
    }

    Animal(int x) {
        System.out.println("Animal Parameterized Constructor");
    }

    //    public static void sound() {
//        System.out.println("Animal sound Method");
//    }
    public void sound() {
        System.out.println("Animal sound Method");
    }
}

class Dog extends Animal {
    int x = 10;

    Dog() {

        System.out.println("Dog Constructor");
    }

    //    public static void sound() {
//        System.out.println("Dog Braks :" + x);
//    }
    public void sound() {
        System.out.println("Dog Braks :" + x);
    }
}

public class Test {

    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        System.out.println(a.x);
    }

}
