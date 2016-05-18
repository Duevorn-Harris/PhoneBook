package com.duevornHarris;

import java.util.*;

/**
 * Created by duevornharris on 5/16/16.
 */
public class PhoneBook {


    HashMap<String, ArrayList<String>> phoneBookEntry = new HashMap<>();


    public void addEntry(String name, ArrayList<String> phoneNumber){
        phoneBookEntry.put(name, phoneNumber);
    }

    public void removeEntry(String name, ArrayList<String> phoneNumber) {
         phoneBookEntry.remove(name, phoneNumber);
    }

   /* public Object lookUp(Map map, String name){
        for( Object e: map.entrySet()) {
            if (map.entrySet(e).equals(name)) {
                return e;
            }
        }
        return null;
    }
*/

    public ArrayList<String> getNumber(String name){
        System.out.println(phoneBookEntry.get(name));
        return phoneBookEntry.get(name);
    }


    public void returnAllEntries() {
        Set entrySet = phoneBookEntry.entrySet();
        Iterator newIterator = entrySet.iterator();
        while(newIterator.hasNext()){
            Map.Entry entry = (Map.Entry)newIterator.next();
            System.out.println("Name is: "+entry.getKey() + " & " + " Phone Number is: "+entry.getValue());
        }
    }

    public Object reverseLookUp(Map map, String number ) {
        for( Object e: map.keySet()) {
            if (map.get(e).equals(number)) {
            return e;
            }
        }
        return null;
    }
}
