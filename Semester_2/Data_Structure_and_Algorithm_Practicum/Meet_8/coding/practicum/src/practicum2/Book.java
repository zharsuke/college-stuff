package practicum2;

public class Book {
    public String title, authorName;
    public int publishedYear, pageAmount, price;

    public Book(String tt, String nm, int yr, int pam, int pr) {
        this.title = tt;
        this.authorName = nm;
        this.publishedYear = yr;
        this.pageAmount = pam;
        this.price = pr;
    }
}
