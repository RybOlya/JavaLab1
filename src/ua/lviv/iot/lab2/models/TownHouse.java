package ua.lviv.iot.lab2.models;

public class TownHouse extends ManorType{
    private int numberOfHouses;



    public TownHouse(String name, String location, float area, float pricePerSquareMeter,
                     int airQuality, int bedrooms, Boolean parking, String heating,
                     String stateOfBuilding, Boolean security, float school, float kindergarten,
                     float groceries, float pharmacy, float gym, float leisureCentre,
                     float privatePlotAreaInAcres, int floors, int numberOfHouses)
    {
        super(name, location, area,pricePerSquareMeter, airQuality, bedrooms, parking,
                heating, stateOfBuilding, security, school, kindergarten, groceries,
                pharmacy, gym, leisureCentre,privatePlotAreaInAcres,floors);
        this.numberOfHouses = numberOfHouses;
    }
    @Override
    public String toString() {
        return "TownHouse:" + super.toString()+
                ", numberOfHouses=" + numberOfHouses;
    }
}
