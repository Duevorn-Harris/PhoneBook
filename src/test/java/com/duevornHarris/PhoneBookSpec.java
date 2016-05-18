package com.duevornHarris;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


/**
 * Created by duevornharris on 5/16/16.
 */
public class PhoneBookSpec {

    PhoneBook newPhoneBook;

    @Before
    public void initializePhoneBook(){

        newPhoneBook = new PhoneBook();

    }

    @Test
    public void addEntryTest(){
        ArrayList<String> multiplePhoneNumbers = new ArrayList<>();

        multiplePhoneNumbers.add("410.693.4243");
        multiplePhoneNumbers.add("410.693.7414");

        newPhoneBook.addEntry("Duevorn", multiplePhoneNumbers);

        int expectedSizeOfPhoneBookEntry = 1;

        int actualSizeOfPhoneBookEntry = newPhoneBook.phoneBookEntry.size();

        Assert.assertEquals("The number of expected entries does not match the actual number if entries ",
                expectedSizeOfPhoneBookEntry, actualSizeOfPhoneBookEntry);

    }

    @Test
    public void removeEntryTest(){
        ArrayList<String> multiplePhoneNumbers = new ArrayList<>();

        multiplePhoneNumbers.add("410.693.4243");
        multiplePhoneNumbers.add("410.693.7414");

        newPhoneBook.phoneBookEntry.put("Duevorn", multiplePhoneNumbers);

        newPhoneBook.removeEntry("Duevorn", multiplePhoneNumbers);

        int expectedSizeOfEntriesInThePhoneBook = 0;

        int actualSizeOfEntriesInThePhoneBook = newPhoneBook.phoneBookEntry.size();

        Assert.assertEquals("The number of expected entries does not match the actual number of entries ",
                expectedSizeOfEntriesInThePhoneBook, actualSizeOfEntriesInThePhoneBook);

    }

    @Test
    public void lookUpTest(){
        ArrayList<String> multiplePhoneNumbers = new ArrayList<>();

        multiplePhoneNumbers.add("410.693.4243");
        multiplePhoneNumbers.add("410.693.7414");

        newPhoneBook.phoneBookEntry.put("Duevorn", multiplePhoneNumbers);

        Object actualReturnValue = newPhoneBook.getNumber("Duevorn");

        String expectedReturnValue = "410.693.4243, 410.693.7414";

        Assert.assertEquals("The expected lookup value does not match the actual lookup value ", actualReturnValue,
                expectedReturnValue);

    }

    @Test
    public void returnAllEntriesTest(){
        //newPhoneBook.phoneBookEntry.put("Duevorn", "410.693.7414");

        //Set actualReturnValue = newPhoneBook.returnAllEntries();

        //Set expectedReturnValue = newPhoneBook.phoneBookEntry.entrySet();

        //Assert.assertEquals("The returned entries do not match the actual entries", actualReturnValue,
        //        expectedReturnValue);
    }

    @Test
    public void reverseLookUpTest(){
        ArrayList<String> multiplePhoneNumbers = new ArrayList<>();

        multiplePhoneNumbers.add("410.693.4243");
        multiplePhoneNumbers.add("410.693.7414");

        newPhoneBook.phoneBookEntry.put("Duevorn", multiplePhoneNumbers);

        Object actualReturnValue = newPhoneBook.reverseLookUp(newPhoneBook.phoneBookEntry, "410.693.7414" );

        Object expectedReturnValue = "Duevorn";

        Assert.assertEquals("The method did not return the correct name ", expectedReturnValue,
                actualReturnValue);
    }



}
