import java.util.*;

class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nPhone Number: " + phoneNumber + "\nEmail: " + email + "\n";
    }
}

public class AddressBook {
    private ArrayList<Contact> contacts = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.run();
    }

    private void run() {
        while (true) {
            System.out.println("Address Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. List Contacts");
            System.out.println("3. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    listContacts();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addContact() {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();

        if (phoneNumber.length() > 10) 
        {
            String a = phoneNumber.substring(0, 10);
            System.out.println("Only 10 digit are accepted " + a);
        }
        /*else 
            System.out.println("Original string: " + phoneNumber);
*/
    
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        Contact contact = new Contact(name, phoneNumber, email);
        contacts.add(contact);
        System.out.println("Contact added successfully!\n");
    }

    private void listContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts in the address book.\n");
        } else {
            System.out.println("Address Book:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
}
