public class Main {
    public static void main(String[] args) {


       Author author1 = new Author("Иванов", "Иван");
        Author author2 = new Author("Петров", "Петр");
        Book book1 = new Book("Мемуары Иванова",2020, author1.getSurname());
        Book book2 = new Book("Стихи Петрова",2010, author2.getSurname());
        book1.setYearPublishing(2021);
        book2.setYearPublishing(2022);
        System.out.println("Автор книги '"+book1.getTitle()+"'- " + book1.getAuthor()+", изданной в  "+book1.getYearPublishing()+" году");
        System.out.println("Автор книги '"+book2.getTitle()+"'- " + book2.getAuthor()+", изданной в  "+book2.getYearPublishing()+" году");




    }
}