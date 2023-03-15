package Leetcode.NationalPark;

import java.util.*;

public class Guest {
    //private String name;
    //private String phoneNumber;
    private Map<String, String> guestList;

    public Guest(Map <String, String> guestList){
        this.guestList = guestList;
    }

    public Guest(String string, String string2) {
    }

    public Map<String, String> getGuestList() {
        return guestList;
    }

    public void setGuest(String name, String phoneNumber) {
        guestList.put(name, phoneNumber);
    }
}
