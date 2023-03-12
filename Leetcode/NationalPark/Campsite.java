package Leetcode.NationalPark;

public class Campsite {
    private String name;
    private int id;
    private int capacity;

    public Campsite(String name, int id, int capacity){
        this.name = name;
        this.id = id;
        this.capacity = capacity;
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return id;
    }

    public int getCapicty(){
        return capacity;
    }
}
