package ex_17_OOPs;

public class Lab164_Car {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.name);

        Car c1 = new Car("Xuv");
        System.out.println(c1.name);

        Car c2 = new Car("Xuv","Sports");
        System.out.println(c2.name+ c2.model);
    }
}

    class Car{
        String name;
        int year;
        String model;

        Car(){
        name = "Unkown car";
        year = 1991;
        model= "GT";
        }

        Car(String givenName){
            this.name = givenName;
        }

        Car(String givenName,String givenModel){
            this.name = givenName;
            this.model = givenModel;
        }
    }

