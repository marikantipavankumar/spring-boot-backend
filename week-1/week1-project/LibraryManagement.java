public class LibraryManagement {
    public static void main(String[] args){
        Library library = new Library();

        // Add sample books
        library.addBook(new Book("B1","java Basics","James Gosling","Programming"));
        library.addBook(new Book("B2","Effective Java","Pavan Marikanti","Coding"));

        // Add sample members
        library.addMember(new Member("M1", "Alice"));
        library.addMember(new Member("M2", "Bob"));

        //show all books
        library.showBooks();

        //Issue and return
        library.issueBook("B1", "M1");
        library.showBooks();

        library.returnBook("B1", "M1");
        library.showBooks();

        //search
        library.searchBook("Effective Java");
    }
}
