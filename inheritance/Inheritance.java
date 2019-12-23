class Car{
    public String brand;
    public int speed;

    public Car(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    public void changeBrand(String brand){
        this.brand=brand;
    }

    public void increaseSpeed(int increase){
        speed += increase;
    }

    public void decreaseSpeed(int decrease){
        speed -= decrease;
    }

    public String printAll(){
        return("brand: " + brand + "\n speed is: " + speed);
    }

}

class raceCar extends Car{

    public boolean turbo;
    
    public raceCar(String brand, int speed, boolean turbo){
        super (brand, speed);
        this.turbo=turbo;
    }

    public void setTurbo(boolean onOrOff){
        turbo = onOrOff;
    }

    public String printAll(){
        return (super.printAll() + "\n turbo is: " + turbo);
    }
}

public class Inheritance{
    public static void main(String[] args){
        raceCar mustang = new raceCar("ford", 95 , true);
        System.out.println(mustang.printAll());
    }
}