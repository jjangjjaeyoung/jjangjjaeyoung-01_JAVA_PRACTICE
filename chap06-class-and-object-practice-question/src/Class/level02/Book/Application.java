package Class.level02.Book;

public class Application {
    public static void main(String[] args) {

        BookDTO book = new BookDTO();
        book.printInformation();

        BookDTO book1 = new BookDTO("자바의정석", "도우출판", "남궁성");
        book1.printInformation();

        BookDTO book2 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        book2.printInformation();
    }
}
