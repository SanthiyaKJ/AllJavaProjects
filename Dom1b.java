public class Dom1b {
    public static void main(String[] args) {
        int x;
        x = 60 + ((45-34) / 2 * 3);
        System.out.println(x);

        //Average on 5 numbers
        int[] age = {24,45,21,52,30};
        int sum=0;
        int i;
        for(i=0; i<5; i++)
        {
            sum = sum + age[i];
        }

        double avg = sum/i;

System.out.println("The average is " + avg);
    }
    
System.out.println("Welcome to the FX currency convertor");
int e = 100;
double bp = e*0.697443;
double ad = e*1.08901;
double jy = e*135.090;
System.out.println("Euro 100 will buy " + bp + "British pounds");
System.out.println("Euro 100 will buy " + ad + "American dollars");
System.out.println("Euro 100 will buy " + jy + "Japanese yen");

}
