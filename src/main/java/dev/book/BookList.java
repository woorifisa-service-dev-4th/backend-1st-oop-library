package dev.book;

public class BookList {
    private String title;
    private String author;
    private String callNumber;
    private String category;

    public BookList(String title, String author, String callNumber, String category) {
        this.title = title;
        this.author = author;
        this.callNumber = callNumber;
        this.category = category;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getCallNumber() { return callNumber; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return String.format("제목: %s | 저자: %s | 청구번호: %s | 카테고리: %s",
                title, author, callNumber, category);
    }
}
