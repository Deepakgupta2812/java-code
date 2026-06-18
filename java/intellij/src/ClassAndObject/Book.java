package ClassAndObject;

public class Book {
    static int TotalNumOfBook;
    String author;
    String title;
    String isbn;
    boolean isBorrowed;

    static {
        TotalNumOfBook=0;
    }
    {//obj init
        TotalNumOfBook++;
    }

    Book(String isbn,String title,String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }
    Book(String isbn){
        this(isbn,"Unknown","Unknown");
    }
    static int getTotalNumOfBook(){
        return TotalNumOfBook;
    }
    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy the book :"+this.title);
        }
    }
        void returnBook(){
            if (isBorrowed){
                this.isBorrowed=false;
                System.out.println("Hope you enjoyed , Please leave review");
            }else {
                System.out.println("This book ia already in the library");
            }
        }

    public static void main(String[] args) {
        Book designOfthings= new Book("1","Design","Author");
        Book myBook=new Book("2");
        System.out.println(Book.getTotalNumOfBook());
        designOfthings.borrowBook();
        myBook.borrowBook();
        designOfthings.borrowBook();
        designOfthings.returnBook();
        designOfthings.returnBook();
    }

}
