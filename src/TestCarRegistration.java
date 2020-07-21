import java.util.Scanner;

public class TestCarRegistration {
    public static void main(String[] args) {
        //todo:: By using array, create 3 CarType objects
        CarType []types = {new CarType("Toyot", "Vios", 1.5),
                         new CarType("Nissan", "Teana", 2.0),
                         new CarType("Honda", "City", 1.6)};
        //todo:: create an array that will able to store 6 registrations
        Registration []reg = new Registration[2];
        
  	  	
  	Scanner scanner = new Scanner(System.in);
  	
  	for (int i = 0; i < reg.length; ++i) {

  		System.out.println("\nRegistration number: " + Registration.currentRegNo);
  		
                //todo:: request and read the owner detail
                System.out.print("Enter name : ");
                String name = scanner.nextLine();
                System.out.print("Enter IC No : ");
                String icNo = scanner.nextLine();              
                //construct owner object
                Person owner = new Person(name,icNo);
  		//todo:: request and read car detail
                System.out.print("Enter Plate No : ");
                String plateNo = scanner.nextLine();  
  		System.out.print("Car Color : ");
                String color = scanner.nextLine(); 
                System.out.print("Enter the car year : ");
                int year = scanner.nextInt();
  		//todo:: display all available carType
               System.out.print("\nCar Types: \n");
                for(int j=0;j < types.length;j++){
                    System.out.print((j+1) + ". " + types[j].toString() +"\n");
                }
                
  		
                System.out.print("\nSelect car type [1.." + types.length + "]: ");
  		int selection = scanner.nextInt();
  		
                //todo:: get cartype from array (based on selection)
                Car car = new Car(plateNo,color, year, types[selection-1]);
              		
  		//todo:: register the car
                reg[i] = new Registration(owner,car);
           
  		scanner.nextLine();
  	}
  
  	//todo:: display all registration detail
        displayListing(reg);
       
  }
  
  public static void displayListing(Registration[] regArr) {
  	System.out.printf("\n\n%50s\n", "Car Registration Listing");
  	System.out.printf("%-6s %-15s %-15s %-10s %-10s %-10s %-10s %-10s %5s\n", 
  		"Reg No", "Name", "IC No.", "Plate No", "Color", "Year", "Make", "Model", "Capacity");
  	for (int i = 0; i < regArr.length; ++i) 
  		System.out.println(regArr[i]);
  }
}