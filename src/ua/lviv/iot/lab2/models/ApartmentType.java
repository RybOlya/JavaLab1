package ua.lviv.iot.lab2.models;

public class ApartmentType extends DwellingInfo{
    private String dwellingClass;
    private int numberOfStoreys;
    private boolean elevator;
    private boolean concierge;

    public ApartmentType(String name, String location, float area, float pricePerSquareMeter,
                         int airQuality, int bedrooms, Boolean parking, String heating,
                         String stateOfDwelling, Boolean security, float school, float kindergarten,
                         float groceries, float pharmacy, float gym, float leisureCentre, String dwellingClass,
                         int numberOfStoreys, boolean elevator, boolean concierge) {
        super(name, location, area, pricePerSquareMeter, airQuality, bedrooms, parking, heating,
                stateOfDwelling, security, school, kindergarten, groceries, pharmacy, gym, leisureCentre);
        this.dwellingClass = dwellingClass;
        this.numberOfStoreys = numberOfStoreys;
        this.elevator = elevator;
        this.concierge = concierge;
    }

    @Override
    public String toString() {
        return super.toString()+
                " dwellingClass='" + dwellingClass + '\'' +
                ", numberOfStoreys=" + numberOfStoreys +
                ", elevator=" + elevator +
                ", concierge=" + concierge;
    }
}
