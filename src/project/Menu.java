package project;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private MenuLogic menuLogic;

    public Menu() {
        scanner = new Scanner(System.in);
        menuLogic = new MenuLogic();
    }

    public void start() {
        printWelcome();
        do {
            printMenu();
        }while (true);
    }

    private void printMenu() {
        System.out.println("1 - aby dodac kontakt");
        System.out.println("2 - aby otrzymac numer");
        System.out.println("3 - aby wypiasc wszystkie numery");

        parseAnswer(scanner.nextLine());
    }

    private void parseAnswer(String s) {
        switch (s){
            case "1":
                addContact();
                break;
            case "2":
                getNumber();
                break;
            case "3":
                menuLogic.printAllContact();
                break;
            default:
                System.out.println("Nie ma takiej komendy");
        }
    }

    private void getNumber() {
        System.out.print("Podaj nazwisko: ");
        String lastname = scanner.nextLine();
        menuLogic.printContact(lastname);
    }

    private void addContact() {
        Contact contact = new Contact();

        System.out.print("Podaj imie:");
        contact.setName(scanner.nextLine());

        System.out.print("Podaj nazwisko:");
        contact.setLastname(scanner.nextLine());

        System.out.print("Podaj numer:");
        contact.setNumber(scanner.nextLine());

        menuLogic.addContact(contact);
    }

    private void printWelcome() {
        System.out.println("Witaj w ksiazce!");
    }
}
