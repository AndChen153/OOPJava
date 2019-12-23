//method overloading

class CarTest
{
    void test (String brand)
    {
       System.out.println ("brand: " + brand);
    }
    void test (int year, String color)
    {
       System.out.println ("year: " + year + ", color:" + color);
    }
}
class CarOverload
{
    public static void main (String args []){
        CarTest car = new CarTest();
        car.test("honda");
        car.test(2017, "blue");
    }
}