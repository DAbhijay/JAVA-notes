class vehicle {
    private String brand;

    void setBrand(String brand) {
        this.brand = brand;
    }
    void getBrand() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends vehicle {
    private int speed;
      void setSpeed(int speed) {
          this.speed = speed;
      }
      void getSpeed() {
          System.out.println("Speed: " + speed);
      }
}

class Bike extends vehicle {
    private int mileage;
      void setMileage(double mileage) {
          this.mileage = mileage;
      }
      void getMileage() {
          System.out.println("Mileage: " + mileage);
      }
}

public class Tutorial_Question_2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.setBrand("Honda City");
        c.setSpeed(120);
        c.getBrand();
        c.getSpeed();

        Bike b = new Bike();
        b.setBrand("Honda Activa");
        b.setMileage(25);
        b.getBrand();
        b.getMileage();
    }
}