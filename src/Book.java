public class Book {
    private String title;
    private int yearPublishing;
    private Author author = new Author();


    public Book(String title, int yearPublishing) {
        this.title = title;
        this.yearPublishing = yearPublishing;


    }

    private class Author {
        private String surname, name;

        public Author() {
            this.surname = surname;
            this.name = name;
        }

    }

    public String getTitle() {
        return title;
    }


    public Author getAuthor(String иванов, String иван) { return this.author; }

    public int getYearPublishing() {
        return yearPublishing;
    }


    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}
