import java.util.ArrayList;
import java.util.Scanner;


/*
Used Class - Blueprint of the object, which makes program more readable and realible
Contact <==> manager <==> user

Using Contact we can store contacts saperatly
than using ContactManager which holds ArrayList which consist all contacts by using Contact class 
 
Contains basic CRUD Operation - addcontacts , deleteContacts , displayContacts and UpdateContacts  
*/ 
class Contact{
    private String Name;
    private String phoneNumber;
    private String email;

    Scanner sc = new Scanner(System.in); 

    //Default Constructor
    public Contact(){
        this.Name = "";
        this.phoneNumber = "";
        this.email = "";

    }
    //Permeterized Constructor;
    public Contact(String Name , String phoneNumber ,String email){
        this.Name = Name;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }
    //Getters & Setters for 
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email){
        this.email = email;
    }

    // display method to display contant details; 
    public void display(){
        System.out.println("Name: " + Name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email" + email);

        System.out.println("********************");
    }

    
}

class ContactManager{

    // using ArryList to collact all contacts of user in one List; 
    public final ArrayList<Contact> contacts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // Adding contacts by USING Contacts class;
    public void addContacts(){
        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Number: ");
        String number = sc.nextLine();

        System.out.println("Enter Email: ");
        String mail = sc.nextLine();

        contacts.add(new Contact(name, number, mail));

        System.out.println("**************************************");
        System.out.println();
        System.out.println("Added New Connection........ ");
        System.out.println();
        System.out.println("**************************************");
        
    }

    //for updating contact
    public void updateContacts(){
        System.out.print("Enter the name of contact To Update: ");
        String name = sc.nextLine();
        
        // using itrater to find contact by name using getter  
        for(Contact contact : contacts){
            if(contact.getName().equalsIgnoreCase(name)){ // it ignores uppercsing to match name ;
                
                // Using setter to modify value; 
                System.out.println("Enter the new Number: ");
                contact.setPhoneNumber(sc.nextLine());  

                System.out.println("Enter New Email: ");
                contact.setEmail(sc.nextLine());

                System.out.println();
                System.out.println(" Contact updated.");
                
                System.out.println("**************************************");
                return;
            }
        }
        System.out.println(" Contact not found.");
        System.out.println("**************************************");
        System.out.println("");

    }
    // deletion of contact
    public void deleteContacts(){
        System.out.print("Enter the name of contact To Update: ");
        String name = sc.nextLine();

        // Using for loop so we  can eazily find and remove contacts by name;
        for(int i = 0 ; i < contacts.size() ; i++){
            if(contacts.get(i).getName().equalsIgnoreCase(name)){
                contacts.remove(i);
                System.out.println(" Contact Deleted.");
                return;

            }
        }
        System.out.println("Contact not found.");
        System.out.println("**************************************");
        System.out.println();
    }
    // to display all contacts;
    public void displayContacts(){
        if(contacts.isEmpty()){
            System.out.println("Contact not found.");
            System.out.println("**************************************");
            System.out.println();

                return;
            }
        for(Contact contact : contacts){
            System.out.println("**************************************");
            System.out.println();
            contact.display();
            System.out.println(); 
            System.out.println("**************************************");

        }
        
    }
        
}



public class ContactManagement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        ContactManager manager  = new ContactManager(); // object declaration of ContactManager class
 
        while(true){
            System.out.println(" 1. Add Contact \n 2. View Contact \n 3. Update Contact \n 4. Delete Contact \n 5. Exit");
      
            System.out.print(" Enter your Choise: ");
            int option = sc.nextInt();


            switch (option) {
                // using errow operater to refer it to actual methods ;
                case 1 -> manager.addContacts(); 
                case 2 -> manager.displayContacts(); 
                case 3 -> manager.updateContacts(); 
                case 4 -> manager.deleteContacts();
                case 5 -> {
                    System.out.println(" Goodbye!");
                    return;
                }
                default-> System.out.println(" Invalid choice.");

                    
            }
        }
        
    }

} 