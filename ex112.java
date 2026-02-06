class ex112
{
    public static void main (String args[])
    {
Product product1 = new Product("tea","organictea",8);
Product product2 = new Product("coffee","blackcoffee", 10);

System.out.println(product1.name);
System.out.println(product1.price);
System.out.println(product2.name + product2.price);

    }
    }

class Product
{
 String type;
 String name;
 int price;

 Product(String type, String name, int Price)
 {
    this.type = type;
    this.name = name;
    this.price = price;
 }
}


