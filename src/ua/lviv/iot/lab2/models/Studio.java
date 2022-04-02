package ua.lviv.iot.lab2.models;

public class Studio extends ApartmentType{
    public Studio(String name, String location, float area, float pricePerSquareMeter,
                  int airQuality, int bedrooms, Boolean parking, String heating,
                  String stateOfDwelling, Boolean security, float school, float kindergarten,
                  float groceries, float pharmacy, float gym, float leisureCentre,
                  String dwellingClass, int numberOfStoreys, boolean elevator, boolean concierge) {
        super(name, location, area, pricePerSquareMeter, airQuality, bedrooms, parking, heating,
                stateOfDwelling, security, school, kindergarten, groceries, pharmacy, gym, leisureCentre,
                dwellingClass, numberOfStoreys, elevator, concierge);
    }

    @Override
    public String toString() {
        return "Studio:" + super.toString();
    }
}
