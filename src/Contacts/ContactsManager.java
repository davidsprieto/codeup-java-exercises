package Contacts;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ContactsManager {
    static Path pathFileToRead = Paths.get("src", "/Contacts/contacts.txt");
    static Path pathFileToWrite = Paths.get("src", "/Contacts/contacts.txt");


    public static void main(String[] args) throws IOException {
        mainMenu();
    }

    // This method is the main menu for the program.
    public static void mainMenu() throws IOException {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("1. View Contacts.");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit.");
        System.out.print("Please enter an option (1, 2, 3, 4, or 5): ");
        int chooseOperation = scanner1.nextInt();

        if (chooseOperation == 1) {
            showContacts();
        } else if (chooseOperation == 2) {
            addContact();
        } else if (chooseOperation == 3) {
            System.out.println("\nSEARCH FOR A CONTACT:\n");
            Scanner scanner3 = new Scanner(System.in);
            System.out.print("Enter a name or phone number: ");
            String searchContact = scanner3.nextLine();
            searchContacts(String.valueOf(pathFileToRead), searchContact);
        } else if (chooseOperation == 4) {
            System.out.println("Working on it.");
        } else if (chooseOperation == 5) {
            System.out.println("\nExit? Okay, have a nice day.");
        }

    }

    // This method allows the user to show all the contacts.
    public static void showContacts() throws IOException {
        System.out.println("\nDISPLAYING CONTACTS\n");
        System.out.println("Name: | Phone Number: \n" + "---------------------");
        Files.lines(pathFileToRead)
                .forEach(System.out::println);
        System.out.println("\nWhat would you like to do next?");
        mainMenu();
    }

    // This method allows the user to add a new contact.
    public static void addContact() throws IOException {
        System.out.println("\nADD A CONTACT:\n");
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter a name and phone number separated by a \"|\": ");
        String newContact = scanner2.nextLine();
        Files.write(pathFileToWrite,
                List.of(newContact),
                StandardOpenOption.APPEND
        );
        System.out.println("\nUpdating list of contacts...\n");
        Files.lines(pathFileToRead)
                .forEach(System.out::println);
        System.out.println("\nWhat would you like to do next?");
        mainMenu();
    }

    // This method allows the user to search for a contact by name.
    public static void searchContacts(String fileName, String searchContact) throws IOException {
        Scanner scanner4 = new Scanner(new File(fileName));
        while(scanner4.hasNext()){
            String contactName = scanner4.nextLine();
            if(contactName.contains(searchContact) || contactName.equalsIgnoreCase(searchContact)){
                System.out.println("\nName: | Phone Number: \n" + "---------------------\n" + contactName);
            }
        }
        System.out.println("\nWhat would you like to do next?");
        mainMenu();
    }

}
