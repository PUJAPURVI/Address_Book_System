package com.AddressBookSystem;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("~~~~WEL-COME TO ADDRESS BOOK PROGRAM~~~~");
        AddressBook addressBook = new AddressBook();
        addressBook.addNewContact();
        addressBook.displayContact();
    }
}
