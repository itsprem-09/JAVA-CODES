class Book {
    private String authorname;
    public Book(String authorname){
        this.authorname=authorname;
    }
    public void print(){
        System.out.println("Author name: "+authorname);
    }
}
class book_publication extends Book{
    private String title;
    public book_publication(String authorname, String title){
        super(authorname);
        this.title=title;
    }
    public void print(){
        super.print();
        System.out.println("Book publication title: "+title);
    }
}
class paper_publication extends Book{
    private String title;
    public paper_publication(String authorname, String title){
        super(authorname);
        this.title=title;
    }
    public void print(){
        super.print();
        System.out.println("Paper publication title: "+title);
    }
}

public class BookDemo{
    public static void main(String[] args) {
        Book b;
        if("book".equals(args[2])){
            b=new book_publication(args[0],args[1]);
        }
        else if("paper".equals(args[2])){
            b=new paper_publication(args[0],args[1]);
        }
        else{
            System.out.println("Invalid publication type");
            return;
        }
        b.print();
    }
}