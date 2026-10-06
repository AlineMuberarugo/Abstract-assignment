public abstract class Member {

    private String name;
    private String id;

    // Constructor
    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Abstract method
    
    public abstract double calculateFees();

    // toString
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }
}
