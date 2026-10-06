public class Main {

    public static void main(String[] args) {

        // Create Book object

        Book book = new Book(
                "Java Programming",
                "James Gosling",
                "BOOK001"
        );

        // Create Publisher object

        Member publisher = new PublisherMember(
                "ABC Publishers",
                "PUB001"
        );

        // Create Student object
        
        Member student = new StudentMember(
                "Aline",
                "ST001"
        );

        // Create Librarian object
        Member librarian = new LibrarianMember(
                "John",
                "LIB001"
        );

  
        System.out.println(book);
        System.out.println(publisher);
        System.out.println(student);
        System.out.println(librarian);

        // Display fees

        System.out.println("Publisher fee: " + publisher.calculateFees());
        System.out.println("Student fee: " + student.calculateFees());
        System.out.println("Librarian fee: " + librarian.calculateFees());
    }
}
