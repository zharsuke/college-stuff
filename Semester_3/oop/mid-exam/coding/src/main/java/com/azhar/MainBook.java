package com.azhar;

public class MainBook {
    public static void main(String[] args) {
        Author author = new Author();
        author.setName("Azhar");
        author.setAddress("Jl. Sukarno Hatta No.9");

        Book book = new Book();
        book.setAuthor(author);
        book.setIsbn("978-1234567890");
        book.setTitle("Hacking Hackers");
        book.setPrice(100_000);

        // Accessing author information from the book
        Author bookAuthor = book.getAuthor();
        System.out.println("Book Author: " + bookAuthor.getName());
        System.out.println("Author's Address: " + bookAuthor.getAddress());
        
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Price: $" + book.getPrice());
        
    }
}
