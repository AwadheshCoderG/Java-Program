class Book {
    static int totalNoOfBooks;
    String author;
    String title;
    String isbn;
    boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }

    {
        totalNoOfBooks ++;
    }

    Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn){
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }else{
            this.isBorrowed = true;
            System.out.println("Enjoy the book");
        }
    }

    void returnBook(){
        if(isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed the book, Please leave a review");
        } else{
            System.out.println("Book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book designOfthings = new Book("1", "Design", "Author");
        Book myBook = new Book("2");
        designOfthings.borrowBook();
        myBook.borrowBook();
        designOfthings.borrowBook();
        designOfthings.returnBook();

    }


}



