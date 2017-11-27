package project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MenuLogic {

    private List<Contact> contactList;

    public MenuLogic(){
        contactList = new ArrayList<>();
    }

    public void addContact(Contact contact){
        contactList.add(contact);
    }

    public void printAllContact(){
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }

    public void printContact(String lastname){
        Collections.sort(contactList);
        
        for (Contact contact : contactList) {
            if(contact.getLastname().equalsIgnoreCase(lastname)){
                System.out.println("Numer: " + contact.getNumber());
                break;
            }
        }
    }

}
