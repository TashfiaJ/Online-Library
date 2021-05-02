// You have to implement a library using Java Class "Library"
// Methods: addBook, issueBook, returnBook, showAvailableBooks
// Properties: Array to store the available books,
// Array to store the issued books
package com.company;
class Library{

    String[] books;
    int noOfBooks;

    public Library(){
    this.books = new String[100];
    this.noOfBooks = 0;}

    void addBook(String s){
        this.books[noOfBooks]= s;
        noOfBooks++;
        System.out.println(s+" has been added.");
    }
    void issueBook(String s){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i].equals(s)){
                this.books[i]=null;
                break;
            }}
            System.out.println(s+" has been issued. This book doesn't exist.");
        }
    void returnBook(String s){
        this.books[noOfBooks] = s;
        noOfBooks++;
            System.out.println(s+" has been added.");
        }

    void showAvailableBooks(){
        for(String i: this.books){
            if(i==null)
                continue;
            System.out.println(i);
        }
        }

}

public class OnlineLibrary {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Learn Java in just 10 minutes");
        centralLibrary.addBook("Learn JavaFX in 2 minutes");
        centralLibrary.addBook("Learn Hacks to learn java fast");
        centralLibrary.addBook("Paradoxical Sajid");
        centralLibrary.addBook("Paradoxical Sajid Part: 2");
        centralLibrary.issueBook("Paradoxical Sajid");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("Paradoxical Sajid");
        centralLibrary.showAvailableBooks();


    }

    }


