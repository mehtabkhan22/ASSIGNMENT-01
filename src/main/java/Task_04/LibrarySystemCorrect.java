/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task_04;

/**
 *
 * @author huzaifa Waheed Khan
 */
public class LibrarySystemCorrect {

    public static void main(String[] args) {

        Book book = new Book("Java Programming", "James Gosling");
        Member member = new Member("Huzaifa", 101);

        System.out.println("Member: " + member.getName());
        System.out.println("Book: " + book.getTitle());

        member.borrowBook(book);

        System.out.println("Book available: " + book.isAvailable());

        // Trying to borrow the same book again
        member.borrowBook(book);

        member.returnBook(book);

        System.out.println("Book available: " + book.isAvailable());
    }
}
