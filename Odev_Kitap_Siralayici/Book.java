/**
 * @author Nida Başer
 * March 2024
 */
package Kitap_Siralayici;

import java.util.*;

class Book implements Comparable<Book> {
    private String title;
    private int pageCount;
    private String author;
    private Date publishDate;

    public Book(String title, int pageCount, String author, Date publishDate) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', pageCount=" + pageCount + ", author='" + author + "', publishDate=" + publishDate + "}";
    }

}
