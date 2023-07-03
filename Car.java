

interface Vehicle {
    void cleanVehicle();
    default void startVehicle() {
        System.out.println("Vehicle Started");
    }
    static void automatic(){
        System.out.println( " It has automatic mode");
    }
}
public class Car implements Vehicle {
    @Override
    public void cleanVehicle() {
        System.out.println("Vehicle cleaned");
    }
    @Override
    public void startVehicle() {
        System.out.println(" Car Vehicle Started");
    }



    public static void main(String[] args) {
        Car c = new Car();
        c.cleanVehicle();
        c.startVehicle();
        Vehicle.automatic();
    }
}
