import java.util.Scanner;
public class Dom2d {

    public static void main (String[] args)
    {
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Qualify for Pension?");
        boolean pension = false;
        if (age > 65)
        {
            pension = true;
        }

        System.out.println(pension);
        sc.close();
    }
    
}
