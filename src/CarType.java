
public class CarType {
    private String brand;
    private String model;
    private double capacity;

    public CarType(String brand, String model, double capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

   public String toString(){
        return String.format("%-10s %-10s %-10s", brand, model, capacity);
    }
    
    
}
