package classroom.book;

public class Example {
    public static void main(String[] args) {

        Author author = new Author("Janis Berzins","janisbee@inbox.lv");
        Book book = new Book("312312","Cooking book",author,43.12,100);

        System.out.println(book);

        Book book2 = new Book("312312","Tree book",new Author("Janis Berzins","janisbee@inbox.lv"),43.12,100);
    }

}
