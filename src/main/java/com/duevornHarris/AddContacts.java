package com.duevornHarris;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by duevornharris on 5/17/16.
 */
public class AddContacts {

    PhoneBook bestPhoneBook = new PhoneBook();
    Scanner sc = new Scanner(System.in);
    boolean nextInput = true;
    boolean anotherInput = true;
    ArrayList<String> phoneNumber = new ArrayList<>();

    public boolean doesNextInputEqualDone(String input) {

        if (input.equals("done")) {
            nextInput = false;
        }
        return nextInput;
    }

    public boolean doesNextAnotherInputEqualFinished(String input) {

        if (input.equals("finished")) {
            anotherInput = false;
        }
        return anotherInput;
    }
/*TODO: Fix addArrayOfNumbers function so that it exits on the first typing of finished It appears that the Scanner is
not reading properly.
 */

    public ArrayList<String> addArrayOfNumbers(){
        Scanner sc = new Scanner(System.in);
        while(anotherInput){
            doesNextAnotherInputEqualFinished(sc.nextLine());
            phoneNumber.add(sc.nextLine());
        }
        System.out.println("You are done entering numbers.");
        return phoneNumber;
    }

    public void addContact() {
        System.out.println("Please enter the name then press enter and then enter the number of the person you want to" +
                " add to your phoneBook. \nType finished when entering phone numbers, then done when completely " +
                "finished.");
        Scanner sc = new Scanner(System.in);
        while (nextInput) {
            doesNextInputEqualDone(sc.nextLine());
            String name = sc.nextLine();
            addArrayOfNumbers();
            bestPhoneBook.addEntry(name, addArrayOfNumbers());

        }
    }


    public void displayEntries() {
        System.out.println("Press 1 to lookup numbers by name. \nPress 2 to lookup name by numbers." +
                "\nPress 3 to display all entries ");
        int choice = sc.nextInt();
        switch (choice)

        {

            case 1:
                System.out.println("Please enter the name of the number you want.");
                Scanner newScanner = new Scanner(System.in);
                String name = newScanner.nextLine();
                System.out.println(bestPhoneBook.getNumber(name));
                break;

            case 2:
                System.out.println("Please enter the number of the name you want.");
                Scanner newSc = new Scanner(System.in);
                String lookUpNumber = newSc.nextLine();
                System.out.println(bestPhoneBook.reverseLookUp(bestPhoneBook.phoneBookEntry, lookUpNumber));
                break;

            case 3:
                bestPhoneBook.returnAllEntries();


        }
    }

}
