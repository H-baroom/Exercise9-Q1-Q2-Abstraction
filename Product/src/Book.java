public class Book extends Product{
    private String author;
    Book(){

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double getDiscount() {
        return super.getPrice() -(super.getPrice() / 100 * 30);
    }

    public Book(String author) {
        this.author = author;
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }
}
