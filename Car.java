// Activity 25 - Tumulak, Ivan Steiven A.

public class Car {
    String model;
    String carMake;
    int year;

    public Car(String carMake, String model, int year) {
        this.carMake = carMake;
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args){
        Car objectToyotaWigo = new Car("Toyota", "Wigo", 2022);
        Car objectHondaCivic = new Car("Honda", "Civic", 2021);
        Car objectFordMustang = new Car("Ford", "Mustang", 2023);

        System.out.println(objectToyotaWigo.carMake + " " + objectToyotaWigo.model + " " + objectToyotaWigo.year);
        System.out.println(objectHondaCivic.carMake + " " + objectHondaCivic.model + " " + objectHondaCivic.year);
        System.out.println(objectFordMustang.carMake + " " + objectFordMustang.model + " " + objectFordMustang.year);
    }
}