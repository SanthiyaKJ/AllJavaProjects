package TestScanner;
import java.util.Scanner;


public class Test {

    public static void main(String[] args)
    {
System.out.println( "Hello World");

Scanner myscanner = new Scanner(System.in);

String name;
System.out.print("Enter your name: ");
name = myscanner.nextLine();

int age;
System.out.print("\nEnter your age: ");
age = myscanner.nextInt();

double salary;
System.out.print("\nEnter your salary: ");
salary = myscanner.nextDouble();

System.out.println("Report");
System.out.println("name:" + name + " age:" + age + "  salary: " + salary );
myscanner.close();
    }
}
