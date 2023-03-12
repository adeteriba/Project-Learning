package Leetcode.NationalPark;

import java.util.*;

public class NationalPark {
    private ArrayList<Campsite> campsite;
    private ArrayList<Rangers> rangers;

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

    public void setRanger(Rangers ranger) {
        rangers.add(ranger);
    }

    public void setCampsite(Campsite site) {
        //this.campsite = campsite;
        campsite.add(site);
    }
}
