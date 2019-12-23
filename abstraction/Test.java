abstract class CarAbs{
    String brand;

    public CarAbs(String brand) { 
        this.brand = brand; 
    } 
    abstract void increaseSpeed(int increase);
    abstract void decreaseSpeed(int decrease);

    public String getBrand() { 
        return brand; 
    }
}

class MiniVan extends CarAbs{
    int speed;

    public MiniVan(String brand, int speed){
        super(brand);
        this.speed = speed;
    }

    public void increaseSpeed(int increase){
        speed += increase;
    }

    public void decreaseSpeed(int decrease){
        speed -= decrease;
    }

    public String toString(){
        return "brand: " + super.brand + "\n speed is: " + speed;
    }
}

public class Test{
    public static void main (String[] args){
        CarAbs c1 = new MiniVan("toyota", 60);
        
        c1.increaseSpeed(10);

        System.out.println(c1.toString());
    }
}

