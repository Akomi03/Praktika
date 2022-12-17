package Fahrzeug;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();//Es wird "Vehicle" ausgegeben, da der Konstruktor von Vehicle aufgerufen wird.

        Car car = new Car();            //Es wird "Vehicle" und "Car" ausgegeben, da der Konstruktor von Vehicle und Car aufgerufen wird.
                                        // Da Car von Vehicle erbt, wird zuerst der Konstruktor von Vehicle aufgerufen.
        Bike bike = new Bike();         //Es wird "Vehicle" und "Bike" ausgegeben, da der Konstruktor von Vehicle und Bike aufgerufen wird.
                                        // Da Bike von Vehicle erbt, wird zuerst der Konstruktor von Vehicle aufgerufen.
    }


}
