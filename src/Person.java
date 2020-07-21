
public class Person {
    private String name;
    private String icNo;

    public Person(String name, String icNo) {
        this.name = name;
        this.icNo = icNo;
    }

    

    public String toString(){
        return String.format("%-15s %-15s", name, icNo);
    }
    




}

