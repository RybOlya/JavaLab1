package ua.lviv.iot.lab2.models;

public class PentHouse extends ApartmentType{
    private Boolean privateRooftop;

    public PentHouse(String name, String location, float area, float pricePerSquareMeter,
                     int airQuality, int bedrooms, Boolean parking, String heating,
                     String stateOfDwelling, Boolean security, float school, float kindergarten,
                     float groceries, float pharmacy, float gym, float leisureCentre, String dwellingClass,
                     int numberOfStoreys, boolean elevator, boolean concierge, Boolean privateRooftop) {
        super(name, location, area, pricePerSquareMeter, airQuality, bedrooms, parking, heating,
                stateOfDwelling, security, school, kindergarten, groceries, pharmacy, gym, leisureCentre,
                dwellingClass, numberOfStoreys, elevator, concierge);
        this.privateRooftop = privateRooftop;
    }

    @Override
    public String toString() {
        return "PentHouse:"+ super.toString()+
                " privateRooftop=" + privateRooftop;
    }
}
