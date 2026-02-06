package carmodel;


    public class Car {
 String manufacturer;
 String model;
 float travelSpeed;
 float topSpeed;
 String fuelType;
 byte noOfSeats;

 public void accelerate()
 {
    System.out.println("car accelerates");
 }

 public void Brake()
 {
    System.out.println("Brake is applied");
    travelSpeed -= 5;
    System.out.println("Now the speed is " + travelSpeed + "kmph");
 }

 public void IndicadeLeft()
 {
    System.out.println("Turn on Indicator left  to turn left side");
 }

 public void IndicateRight()
 {
    System.out.println("Turn on Indicator right  to turn right side");
 }

public void ChangeGear()
{
    System.out.println("Gear is changed");
}

public void Beep()
{
    System.out.println("Beep.. Beep.."); 
}



    }



 
 

    

