package Leetcode.NationalPark;

import java.util.*;

public class NationalPark {
    private ArrayList<Campsite> campsite;
    private ArrayList<Rangers> rangers;
    private ArrayList<Guest> guests;

    public NationalPark(){
        campsite = new ArrayList<>();
        rangers = new ArrayList<>();
    }

    public List <Campsite> getCampsites(){
        return campsite;
    }

    public List<Rangers> getRangers() {
        return rangers;
    }

    public List<Guest> getGuests(){
        return guests;
    }

    public void setRanger(Rangers ranger) {
        rangers.add(ranger);
    }

    public void setCampsite(Campsite site) {
        //this.campsite = campsite;
        campsite.add(site);
    }

    public void setGuest(Guest atCamp){
        guests.add(atCamp);
    }
}
