//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Book1",250,"Ali");
        System.out.println(book1.getName());
        System.out.println(book1.getPrice());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getDiscount());
        book1.setPrice(100);
        System.out.println(book1.getDiscount());
        System.out.println("################################################################");
        Book book2 = new Book("Book-2",120,"Hashim");
        System.out.println(book2.getName());
        System.out.println(book2.getPrice());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getDiscount());
        book2.setPrice(330);
        System.out.println(book2.getDiscount());
        System.out.println("################################################################");
        Movie movie1 = new Movie("Movie1",150,"Faisal");
        System.out.println(movie1.getDirector());
        System.out.println(movie1.getName());
        System.out.println(movie1.getDirector());
        System.out.println(movie1.getDiscount());
        movie1.setPrice(900);
        System.out.println(movie1.getDiscount());
        System.out.println("################################################################");
        Movie movie2 = new Movie("Movie-2",290,"Osama");
        System.out.println(movie2.getDirector());
        System.out.println(movie2.getName());
        System.out.println(movie2.getDirector());
        System.out.println(movie2.getDiscount());
        movie2.setPrice(450);
        System.out.println(movie2.getDiscount());




    }
}