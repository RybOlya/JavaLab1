package ua.lviv.iot.lab2.models;

public class DetachedHouse extends ManorType{
    private Boolean additionalPremises;

    public DetachedHouse(String name, String location, float area, float pricePerSquareMeter,
                         int airQuality, int bedrooms, Boolean parking, String heating,
                         String stateOfDwelling, Boolean security, float school, float kindergarten,
                         float groceries, float pharmacy, float gym, float leisureCentre,
                         float privatePlotAreaInAcres, int floors, Boolean additionalPremises) {
        super(name, location, area, pricePerSquareMeter, airQuality, bedrooms, parking, heating,
                stateOfDwelling, security, school, kindergarten, groceries, pharmacy, gym, leisureCentre,
                privatePlotAreaInAcres, floors);
        this.additionalPremises = additionalPremises;
    }

    @Override
    public String toString() {
        return "DetachedHouse:"+ super.toString() +
                " additionalPremises=" + additionalPremises;
    }

    public Boolean getAdditionalPremises() {
        return additionalPremises;
    }

    public void setAdditionalPremises(Boolean additionalPremises) {
        this.additionalPremises = additionalPremises;
    }
}
