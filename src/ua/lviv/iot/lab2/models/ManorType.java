package ua.lviv.iot.lab2.models;

public class ManorType extends DwellingInfo{
    private float privatePlotAreaInAcres;
    private int floors;

    public ManorType(String name, String location, float area, float pricePerSquareMeter,
                     int airQuality, int bedrooms, Boolean parking, String heating,
                     String stateOfDwelling, Boolean security, float school, float kindergarten,
                     float groceries, float pharmacy, float gym, float leisureCentre,
                     float privatePlotAreaInAcres, int floors) {
        super(name, location, area, pricePerSquareMeter, airQuality, bedrooms, parking,
                heating, stateOfDwelling, security, school, kindergarten, groceries, pharmacy, gym, leisureCentre);
        this.privatePlotAreaInAcres = privatePlotAreaInAcres;
        this.floors = floors;
    }

    @Override
    public String toString() {
        return super.toString() +
                " privatePlotAreaInAcres=" + privatePlotAreaInAcres +
                ", floors=" + floors;
    }
}
