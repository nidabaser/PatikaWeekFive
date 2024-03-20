/**
 * @author Nida Başer
 * March 2024
 */
package Kitap_Siralayici;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("KİTAP SIRALAYICI");
        // Kitapları isme göre sıralayan TreeSet
        Set<Book> bookSetByName = new TreeSet<>();
        bookSetByName.add(new Book("Dijital Kale", 350, "Dan Brown", new Date()));
        bookSetByName.add(new Book("Önyargının Doğası", 200, "Gordon Allport", new Date()));
        bookSetByName.add(new Book("Otostopçunun Galaksi Rehberi", 400, "Douglas Adams", new Date()));
        bookSetByName.add(new Book("Savaş ve Barış", 300, "Tolstoy", new Date()));
        bookSetByName.add(new Book("Denizler Altında yirmi bin fersah", 250, "Jules Verne", new Date()));

        System.out.println("Kitaplar isme göre sıralandı:");
        for (Book book : bookSetByName) {
            System.out.println(book);
        }

        // Kitapları sayfa sayısına göre sıralayan TreeSet
        Set<Book> bookSetByPageCount = new TreeSet<>(Comparator.comparingInt(Book::getPageCount));
        bookSetByPageCount.addAll(bookSetByName);

        System.out.println("\nKitaplar sayfa sayısına göre sıralandı:");
        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }
    }
}
