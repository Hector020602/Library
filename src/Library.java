public class Library {
    public static void main(String[] args) {
        Author author = new Author( "Patrick Rothfuss",
                "patrick@gmail.com",  'm');
        System.out.println(author);
        Author a2 = author;
        System.out.println(a2);

        Book book = new Book("The name of the wind", author, 35, 10);
        Book b2 = new Book("Foundation", new Author("Isaak Asimov", "isa@ggg.com",'m'), 34);

        System.out.println(book);
        System.out.println(b2);
        }

    }

