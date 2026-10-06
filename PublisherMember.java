public class PublisherMember extends Member {

    // Constructor
    public PublisherMember(String name, String id) {
        super(name, id);
    }

    // Calculate fee
    @Override
    public double calculateFees() {
        double flatFee = 5000;
        double fivePercent = 250;
        double extraFee = 20000;

        return flatFee + fivePercent + extraFee;
    }

    // toString
    @Override
    public String toString() {
        return "Publisher Member: " + getName() +
               ", ID: " + getId() +
               ", Fee: " + calculateFees();
    }
}
