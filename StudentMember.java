public class StudentMember extends Member {

    // Constructor
    public StudentMember(String name, String id) {
        super(name, id);
    }

    // Calculate fee
    @Override
    public double calculateFees() {
        if (getId() != null && !getId().isEmpty()) {
            return 0;
        }

        return 5000;
    }

    // toString
    @Override
    public String toString() {
        return "Student Member: " + getName() +
               ", ID: " + getId() +
               ", Fee: " + calculateFees();
    }
}
