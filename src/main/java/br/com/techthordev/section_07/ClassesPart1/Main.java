package br.com.techthordev.section_07.ClassesPart1;

public class Main {

    static void main() {

        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setColor("black");
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Carrera");
        targa.setDoors(2);
        targa.setColor("Red");
        targa.describeCar();
    }
}
