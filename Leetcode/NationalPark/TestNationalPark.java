package Leetcode.NationalPark;

public class TestNationalPark {
    public static void main (String [] args){
        NationalPark nationalPK = new NationalPark();
        nationalPK.setCampsite(new Campsite("Campsite 1", 0, 0));
        nationalPK.setCampsite(new Campsite("Campsite 2", 1, 5000));
        nationalPK.setCampsite(new Campsite("Campsite 3", 2, 5000));
        nationalPK.setRanger(new Rangers("Ranger Smith", "+35399988771", "35368978731"));
        nationalPK.setRanger(new Rangers("Ranger Jones", "+35399988772", "+35368978732"));
        nationalPK.setRanger(new Rangers("Ranger Wilson", "+35399988773", "+35368978733"));
        nationalPK.setRanger(new Rangers("Ranger Brown", "+35399988774", "+35368978734"));
        nationalPK.setRanger(new Rangers("Ranger Taylor", "+35399988775", "+35368978735"));
        nationalPK.setRanger(new Rangers("Ranger Miller", "+35399988776", "+35368978736"));
        nationalPK.setRanger(new Rangers("Ranger Davis", "+35399988777", "+35368978737"));
        nationalPK.setRanger(new Rangers("Ranger Moore", "+35399988778", "+35368978738"));
        nationalPK.setRanger(new Rangers("Ranger Anderson", "+35399988779", "+35368978739"));
        nationalPK.setRanger(new Rangers("Ranger Clark", "+35399988780", "+35368978740"));

        //How many rangers work at the park?
        System.out.println("Number of rangers at the park: " + nationalPK.getRangers().size());

        // Which are the campsites at the park?
        System.out.println("Campsites at the park: ");
        for(Campsite campsite: nationalPK.getCampsites()){
            System.out.println(campsite.getName());
        }

        // What's the Home Phone Number of Ranger Smith?
        for (Rangers ranger : nationalPK.getRangers()) {
            if (ranger.getName().equals("Ranger Smith")) {
                System.out.println("Ranger Smith Home Phone Number: " + ranger.getHomePhone());
            }
        }

    }
}
