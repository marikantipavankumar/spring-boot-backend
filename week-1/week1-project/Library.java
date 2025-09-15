import java.util.*;

class Library {
    private Map<String, Book> books = new HashMap<>();
    private Map<String, Member> members = new HashMap<>();
    private Map<String, List<Book>> borrowedBooks = new HashMap<>();

    // Add a new book
    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    // Register a new member
    public void addMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    // Search by title
    public void searchBook(String title) {
        books.values().stream()
                .filter(b -> b.getTitle().equalsIgnoreCase(title))
                .forEach(System.out::println);
    }

    // Issue a book
    public void issueBook(String bookId, String memberId) {
        Book book = books.get(bookId);
        Member member = members.get(memberId);

        if (book == null || member == null) {
            System.out.println("Invalid Book or Member!");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Book already issued!");
            return;
        }

        book.setAvailable(false);
        borrowedBooks.putIfAbsent(memberId, new ArrayList<>());
        borrowedBooks.get(memberId).add(book);

        System.out.println("Book issued to " + member.getName());
    }

    // Return a book
    public void returnBook(String bookId, String memberId) {
        Book book = books.get(bookId);
        if (book != null && borrowedBooks.containsKey(memberId)) {
            borrowedBooks.get(memberId).remove(book);
            book.setAvailable(true);
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Invalid return!");
        }
    }

    // Show all books
    public void showBooks() {
        books.values().forEach(System.out::println);
    }
}
