/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task_04;

/**
 *
 * @author codez
 */
public class Book {

    private final String title;
    private final String author;
    private boolean available;

    public Book(String title, String author) {
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

    public boolean borrow() {

        if (!available) {
            return false;
        }

        available = false;
        return true;
    }

    public void giveBack() {
        available = true;
    }
}
