package Praktikum8;

public class App {
    public static void main(String[] args) {
      Owner owner1 = new Owner("Arsyad");
      Owner owner2 = new Owner("Ardhan");
      Owner owner3 = new Owner("Budhi");
      Owner owner4 = new Owner("Galuh");

      Car car1 = new Car(owner1, "Toyota GR Yaris", 2022, 6500);
      Car car2 = new Car(owner2, "Jeep Wrangler", 1972, 6000);
      Car car3 = new Car(owner3, "Mazda RX 87", 1967, 10500);
      Car car4 = new Car(owner4, "Mercedez benz 220", 1958, 5500);
      
      car1.tampilkanData();
      car2.tampilkanData();
      car3.tampilkanData();
      car4.tampilkanData();
      
  
     
      }
}
