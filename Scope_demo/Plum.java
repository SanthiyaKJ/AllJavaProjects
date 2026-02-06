package Scope_demo;

public class Plum {

    //instance variables cannot access non static method
    String manufacturer = "brophy";
    float weight = 1.5f;

    // Static Variable - shared variable to all objects from class
    static int noOfPlums = 0;
    //methods or behaviours or actions
    //instance method - non static method can access static varaible
    public void pick()
    {
        int x = 5;
        //can access static varaible
        System.out.println("Pick a plum");
        System.out.println("checking if we are seeing static varaible" +    noOfPlums);
    }

    public Plum()
    {
        Plum.noOfPlums += 1;
    }

    public static void main(String args[])
    { 
      //  int noOfPlums = 0; //local varaible
        Plum p1 = new Plum(); //create object from plum class
        Plum p2 = new Plum();
        Plum p3 = new Plum();


        p1.pick();
        //noOfPlums = noOfPlums+1;
        //Plum.noOfPlums = Plum.noOfPlums+1;


        p2.pick();
        //noOfPlums = noOfPlums+1;
        //Plum.noOfPlums = Plum.noOfPlums+1;
        
        p3.pick();
        //noOfPlums = noOfPlums+1;
        //Plum.noOfPlums = Plum.noOfPlums+1;

        System.out.println(noOfPlums);

        p3.pick();
    }
    
    public static void testAccess()
    {
System.out.println(weight); //cannot access instance vaaribels

}
}