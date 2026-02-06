/*public class ex115 {

    public static void main (String args[])

    {

    //We are learning about the vairables to day in the exercise.

    String location = "Goa";
  double salestax;
    if(location == "Goa")
    {
        salestax = 0.45;
        System.out.print(salestax);
    }

    else
    {
        salestax = 1.5;
        System.out.print("The tax for your location is" + salestax);

    }
    }
}

*/
public class ex115 {
static double salestax;
    public static void main (String args[])

    {
    //We are learning about the scope of vairables to day in the exercise.
    String location = "Delhi";
 
    if(location == "Goa")
    {
        salestax = 0.45;
        
    }

    else
    {
       otherstates();
    }

    System.out.println("The sales tax for your location is" + salestax);
    }


public static double otherstates()
{
    salestax = 0.5;
    return salestax;
}
}