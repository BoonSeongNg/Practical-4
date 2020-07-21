
public class Registration {
 
    public static int currentRegNo = 1001;
    
    private int regNo;
    private Person owner;
    private Car car;

    public Registration(Person owner, Car car) {
        this.owner = owner;
        this.car = car;
        currentRegNo++;
    }

    public String toString() {
        return String.format("%-6d %-5s %-5s", currentRegNo,owner.toString(),car.toString());
       
    }

    
    
    
}
