public class LibrarianMember extends Member {

    // Constructor

    public LibrarianMember(String name, String id) {
        super(name, id);
    }

    // Calculate fee

    @Override
    public double calculateFees() {
        return 0;
    }

    // toString
    
    @Override
    public String toString() {
        return "Librarian Member: " + getName() +
               ", ID: " + getId() +
               ", Fee: " + calculateFees();
    }
}
