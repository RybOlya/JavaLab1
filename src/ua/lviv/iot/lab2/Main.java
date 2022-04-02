package ua.lviv.iot.lab2;

import ua.lviv.iot.lab2.models.* ;
public class Main {
    public static void main(String[] args){
        DwellingInfo apartmentOnStusa = new Studio("ЖБ на Стуса", "вул. Стуса, 39", 100, 30000, 31, 2, true, "індивідуальне", "зданий в експлуатацію", true, 800, 200, 200, 500, 500, 100, "бізнес", 9, true, true);
        System.out.println(apartmentOnStusa);
        DwellingInfo townhouseProvesin = new TownHouse("Провесінь","вул. Тракт Глинянський, 152",181,31000,33,3,true,"газовий котел", "без ремонту",false, 300, 300, 210, 300, 500, 700, 8,1,29);
        System.out.println(townhouseProvesin);
        DwellingInfo apartmentOnYaroslavenka = new PentHouse("Вілла Швейцарія", "вул. Ярославенка, 21",90,30000,15,2, true, "індивідуальне", "зданий в експлуатацію", true, 200, 100, 50, 50, 800, 100, "комфорт", 5, true, true, true);
        System.out.println(apartmentOnYaroslavenka);
        DwellingInfo cottageTimberland = new DetachedHouse("КМ TIMBERLAND", "вул. Лисеницька, 66", 190,28000, 0,3,true, "газовий котел", "з чорновим ремонтом",true, 300, 200, 300, 500, 400, 800, 1.5F, 2,false);
        System.out.println(cottageTimberland);
    }
}
