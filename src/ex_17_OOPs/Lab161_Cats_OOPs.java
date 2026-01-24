package ex_17_OOPs;

public class Lab161_Cats_OOPs {
    public static void main(String[] args) {
        Cat c = new Cat();
        Cat c1 = new Cat("Kitty");
        Cat c2 = new Cat("Lucy");
        Cat c3 = new Cat("Oggy");
        Cat c4 = new Cat("Jynx");
        Cat c5 = new Cat("Kitty,2025");

        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println(c5.name+""+c5.year);

    }
}

class Cat{
    String name;
    int year;

    Cat(){
        System.out.println("Default Constructor");
    }

    Cat(String givenName){
        this.name = givenName;
    }

    Cat(String givenName,int year_adopted){
        this.name = givenName;
        this.year = year_adopted;
    }
}
