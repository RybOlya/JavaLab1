package ua.lviv.iot.firstLab;

public record TravelVoucher(String country,
                            int durationInDays,
                            int priceInEuro,
                            int hotelStars,
                            String mealType,
                            boolean healthInsurance) {

    public static String contactNumber = "067 008 0000";

    public static String showContactNumber() {
        return contactNumber;
    }
    public TravelVoucher() {
        this("Sri-Lanka", 7, 30000, 4, "OB", true);
    }
    public TravelVoucher(String country,
                         int durationInDays,
                         int priceInEuro) {

        this(country, durationInDays, priceInEuro, 4, "OB", true);
    }

    @Override
    public String toString() {
        return "Travel Voucher info: ["
                + "country: " + country + ", "
                + "duration:" + durationInDays + ", "
                + "price:" + priceInEuro + ", "
                + "hotel stars number: " + hotelStars + ", "
                + "meal type:" + mealType + ", "
                + "health insurance included:" + healthInsurance + "]";
    }
}
