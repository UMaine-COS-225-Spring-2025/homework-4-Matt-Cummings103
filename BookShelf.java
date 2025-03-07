import java.util.ArrayList;

public class BookShelf {
    public char t; 
    public ArrayList<Book> books = new ArrayList<Book>();

    public BookShelf(){
	 t = 'O';
    }

    public BookShelf(char t){
        this.t = t;
    }

    public void addBook(Book b){
        if (books.size() < 8){
            if (b.getTitle().charAt(0) == t){
                books.add(b);
            }
        } 
    }

    public void removeBook(Book b){
        books.remove(b);
    }

    public String toString(){
        String b = "";
        if (books.size() != 0){
            for (int i = 0; i < books.size(); i++){
                b += books.get(i) + "   ";
            }
            return b;
        }
        return "Empty";
    }

}
