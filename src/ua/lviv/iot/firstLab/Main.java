package ua.lviv.iot.firstLab;

public class Main {
    public static void main(String[] args){
        TravelVoucher sri_Lanka = new TravelVoucher();
        System.out.println(sri_Lanka);
        TravelVoucher turkey = new TravelVoucher("Turkey",12,11000);
        System.out.println(turkey);
        TravelVoucher greece = new TravelVoucher("Greece", 5, 18000, 4,"AI",true);
        System.out.println(greece);

        System.out.println("Travel Agency number: " + TravelVoucher.showContactNumber());
    }
}
