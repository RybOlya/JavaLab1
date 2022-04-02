package ua.lviv.iot.lab2.models;

public class DwellingInfo {
    private String name;
    private String location;
    private float area;
    private float pricePerSquareMeter;
    private int airQuality;
    private int bedrooms;
    private Boolean parking;
    private String heating;
    private String stateOfDwelling;
    private Boolean security;
    private InfrastructureProximity inf;
    public DwellingInfo(String name, String location, float area, float pricePerSquareMeter,
                        int airQuality, int bedrooms, Boolean parking, String heating,
                        String stateOfDwelling, Boolean security, float school, float kindergarten,
                        float groceries, float pharmacy, float gym, float leisureCentre) {
        this.name = name;
        this.location = location;
        this.area = area;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.airQuality = airQuality;
        this.bedrooms = bedrooms;
        this.parking = parking;
        this.heating = heating;
        this.stateOfDwelling = stateOfDwelling;
        this.security = security;
        this.inf = new InfrastructureProximity(school, kindergarten, groceries,pharmacy,gym,leisureCentre);
    }

    @Override
    public String toString() {
        return " Name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", area=" + area +
                ", pricePerSquareMeter=" + pricePerSquareMeter +
                ", airQuality=" + airQuality +
                ", bedrooms=" + bedrooms +
                ", parking=" + parking +
                ", heating='" + heating + '\'' +
                ", stateOfDwelling='" + stateOfDwelling + '\'' +
                ", security=" + security +
                ", " + inf;
    }
}
