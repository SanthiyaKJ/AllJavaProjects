package carmodel;

public class Main {
    public static void main(String[] args)
    {
        Car c1 = new Car();
        c1.manufacturer = "Ford"; 
  c1.model = "Ka"; 
  c1.travelSpeed = 85.25f; 
  c1.topSpeed = 180.20f; 
  c1.fuelType = "petrol"; 
  c1.noOfSeats = 5;
System.out.println("Car 1 Manufacturer: " + c1.manufacturer); 
  System.out.println("Car 1 Model: " + c1.model); 
  System.out.println("Car 1 Travel Speed: " + c1.travelSpeed); 
  System.out.println("Car 1 Top Speed: " + c1.topSpeed); 
  System.out.println("Car 1 Fuel Type: " + c1.fuelType); 
  System.out.println("Car 1 No. of Seats: " + c1.noOfSeats);

  c1.Beep();
  c1.Brake();
  c1.Brake();
  System.out.println(c1.travelSpeed);


  Car c2 = new Car();
    c2.manufacturer = "Toyota"; 
  c2.model = "Corolla"; 
  c2.travelSpeed = 65.25f; 
  c2.topSpeed = 190.30f; 
  c2.fuelType = "diesel";
  c2.noOfSeats = 6;
System.out.println("Car 2 Manufacturer: " + c2.manufacturer); 
  System.out.println("Car 2 Model: " + c2.model); 
  System.out.println("Car 2 Travel Speed: " + c2.travelSpeed); 
  System.out.println("Car 2 Top Speed: " + c2.topSpeed); 
  System.out.println("Car 2 Fuel Type: " + c2.fuelType); 
  System.out.println("Car 2 No. of Seats: " + c2.noOfSeats);
c2.Beep();
  c2.Brake();
  c2.Brake();
  System.out.println(c2.travelSpeed);
    }
    
}
