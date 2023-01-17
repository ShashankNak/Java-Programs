class Library{
    private String []AvailableBooks;
    private String []IssuedBooks;
    private int Asize = 10;
    private int Isize = 10;
    Library(){
        Asize = 10;
        Isize = 10;
    }

    Library(int X){
        Asize = X;
        Isize = 10;
    }

    Library(int X, int Y){
        Asize = X;
        Isize = Y;
    }
    
    {AvailableBooks = new String[Asize];
    IssuedBooks = new String[Isize];}

    public void addBook(String name){
        int i = 0;
        while(i<Asize && (AvailableBooks[i] != null)){
            i++;
        }
        if (i>=Asize){
            System.out.println("Bookshelf is full!");
            return;
        }
        AvailableBooks[i] = name;
        System.out.println("Book Added!");
    }

    public void issueBook(String name){
        int i=0;
        while (i<Asize&&(AvailableBooks[i] != name)){
            i++;
        }

        if (i>=Asize){
            System.out.println("\nThere's no such book available");
            return;
        }
        System.out.println("\nBook is issued with name " + name);

        int j =0;
        while (j<Isize&&(IssuedBooks[j] != null)){
            j++;
        }

        if (j >=Isize){
            System.out.println("\nYou have much books return the book first.");
            return;
        }
        IssuedBooks[j] = name;
        AvailableBooks[i] = null;
    }

    public void showAvailableBooks() {
        System.out.println("\nAvailable Books:");
        for(int i=0;i<Asize;i++){
            if (AvailableBooks[i] == null){
                continue;
            }
            System.out.println("--> "+AvailableBooks[i]);
        }
    }

    public void MyBooks(){
        System.out.println("\nIssued Books:");
        for(int i=0;i<Isize;i++){
            if (IssuedBooks[i] == null){
                continue;
            }
            System.out.println("--> "+IssuedBooks[i]);
        }
    }

    public void returnBook(String name){
        int i=0;
        while (i<Isize&&(IssuedBooks[i] != name)){
            i++;
        }

        if (i>=Isize){
            System.out.println("\nThere's no such book you have Issued");
            return;
        }
        System.out.println("\nBook is returned with name " + name);

        int j =0;
        while (j<Asize&&(AvailableBooks[j] != null)){
            j++;
        }

        if (j >= Asize){
            System.out.println("\nLibrary is full now return later or Issue some books!");
            return;
        }
        IssuedBooks[i] = null;
        AvailableBooks[j] = name;
    }
}

public class LibraryMangement {
    public static void main(String[] args) {
        Library Rahul = new Library(10,5);
        Rahul.addBook("Pirates of the carribean");
        Rahul.addBook("Three Musketters");
        Rahul.addBook("Programming with python");
        Rahul.addBook("Basic of Java");
        Rahul.addBook("Android");
        Rahul.addBook("OS");


        Rahul.showAvailableBooks();

        Rahul.issueBook("Pirates of the carribean");
        Rahul.showAvailableBooks();
        Rahul.MyBooks();

        Rahul.issueBook("Pirates of the carribean");

        Rahul.issueBook("Three Musketters");
        Rahul.showAvailableBooks();
        Rahul.MyBooks();

        Rahul.issueBook("Basic of Java");
        Rahul.showAvailableBooks();
        Rahul.MyBooks();

        Rahul.issueBook("Programming with python");
        Rahul.showAvailableBooks();
        Rahul.MyBooks();

        Rahul.issueBook("Programming with python");
        Rahul.showAvailableBooks();
        Rahul.MyBooks();
        
        Rahul.issueBook("Programming with python");

        Rahul.returnBook("Basic of Java");
        Rahul.showAvailableBooks();
        Rahul.MyBooks();

        Rahul.returnBook("Programming with python");
        Rahul.showAvailableBooks();
        Rahul.MyBooks();

        Rahul.returnBook("Three Musketters");
        Rahul.showAvailableBooks();
        Rahul.MyBooks();

        Rahul.addBook("Harry Potter");

        Rahul.returnBook("Pirates of the carribean");

        // Rahul.returnBook("Pirates of the carribean");

        Rahul.issueBook("Programming with python");
        Rahul.showAvailableBooks();
        Rahul.MyBooks();

        Rahul.addBook("Jingle Bell");

        Rahul.returnBook("Programming with python");
        Rahul.showAvailableBooks();
        Rahul.MyBooks();

        Rahul.addBook("kotlin");
        Rahul.addBook("GUI");
        Rahul.addBook("Madmax");

        Rahul.showAvailableBooks();
        Rahul.MyBooks();
    }
}
