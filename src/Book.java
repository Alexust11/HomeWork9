public class Book {
    private String title;
    private String author;
    private int yearPublishing;

    public Book(String title, int yearPublishing, String author) {
        this.title=title;
        this.yearPublishing=yearPublishing;
        this.author=author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }



    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing=yearPublishing;
    }
}
