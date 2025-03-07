public class LibraryTester {
    public static void main(String[] args) {
        BookShelf O = new BookShelf('O');
        BookShelf T = new BookShelf('T');

        System.out.println(O.toString());
        System.out.println(T.toString());

        Book a = new Book("The Heart of the Betrayed", "Crime");
        Book b = new Book("Our Hill of Stars", "Fantasy");
        Book c = new Book("One of a Kind", "Science Fiction");
        Book d = new Book("The Vision of Roses", "Romance");

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());

        O.addBook(a);
        O.addBook(b);
        O.addBook(c);
        O.addBook(d);

        T.addBook(a);
        T.addBook(b);
        T.addBook(c);
        T.addBook(d);

        System.out.println(O.toString());
        System.out.println(T.toString());
    }
}
