package practiceQuestions2;

class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " has been added!");
    }

    void showAvailableBooks(){
        System.out.println("Available Books are:");
        for (String book : this.books) {
            if (book == null){
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book){
        for (int i=0;i<this.books.length;i++){
            if (this.books[i].equals(book)){
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }

    void returnBook(String book){
        addBook(book);
    }

}
public class Q3_onlineLibrary {
    public static void main(String[] args) {

        Library centralLibrary = new Library();
        centralLibrary.addBook("Atomic Habits");
        centralLibrary.addBook("DSA");
        centralLibrary.addBook("JAVA");
        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("JAVA");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("JAVA");
        centralLibrary.showAvailableBooks();
    }
}
