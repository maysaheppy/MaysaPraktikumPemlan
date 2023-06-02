package Praktikum8;

public class Car extends Vehicle{

  private Owner o;
  private String name;
  private int year;
  private double rpm;


 public Car(Owner o, String name, int year, double rpm) {
    this.o = o;
    this.name = name;
    this.year = year;
    this.rpm = rpm;
  }


  public void tampilkanData() {
    System.out.println("Car name\t: " + this.name);
    System.out.println("Car owner\t: " + this.o.getName());
    System.out.println("Output year\t: " + this.year);
    System.out.println("RPM\t\t: " + this.rpm + "\n");
  }
}
