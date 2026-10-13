/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task_04;

/**
 *
 * @author codez
 */
public class LibrarySystemBad {

    public static void main(String[] args) {

        Book book = new Book("Java Programming", "James Gosling");
        Member member = new Member("Huzaifa", 101);

        System.out.println("Member: " + member.getName());
        System.out.println("Book: " + book.getTitle());

        member.borrowBook(book);

        System.out.println("Book available: " + book.isAvailable());

        member.returnBook(book);

        System.out.println("Book available: " + book.isAvailable());
    }
}

class BookBad {

    private final String title;
    private final String author;
    private boolean available;

    public BookBad(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrow() {
        available = false;
    }

    public void giveBack() {
        available = true;
    }
}

class MemberBad {

    private final String name;
    private final int memberId;

    public MemberBad(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrow();
            System.out.println(name + " borrowed " + book.getTitle());
        }
    }

    public void returnBook(Book book) {
        book.giveBack();
        System.out.println(name + " returned " + book.getTitle());
    }
}
