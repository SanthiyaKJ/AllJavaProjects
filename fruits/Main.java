package fruits;

public class Main {

    public static void main(String[] args) {
        //consume an instance from class
        Peach p1 = new Peach();
        // classname variable(store memory) = new classname() 
        System.out.println("The country of orgin is " + p1.country);
        System.out.println("The price is " + p1.price);
        p1.eat(); 
        p1.peel();
}
}