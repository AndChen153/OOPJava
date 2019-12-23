//method overriding

public class Car{

    public void rev(){
        System.out.println("vroom vroom");
    }

}


class raceCar extends Car{
    public void rev(){
        System.out.println("VROOM VROOM");
    }

    public static void main(String[] args){
            
        Car lightningMcqueen = new raceCar();
        lightningMcqueen.rev();
    }
}