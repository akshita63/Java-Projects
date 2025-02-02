package LibraryHandling;

import java.util.ArrayList;


import java.util.Scanner;



public class Library {
	 private ArrayList<books> books1 = new ArrayList<books>();


public void addBook(books b) {
    books1.add(b);
}
public void removeBook(String ISBN) {
    for (books b : books1) {
        if (b.ISBN.equals(ISBN)) {
            books1.remove(b);
            break;
        }
    }
}
public void displayBook() {
	for(books b:books1) {
		System.out.println("Title is "+b.title);
		System.out.println("Authoris "+b.author);
		System.out.println("ISBN  is "+b.ISBN);
		System.out.println();
	}
	}
		
}




