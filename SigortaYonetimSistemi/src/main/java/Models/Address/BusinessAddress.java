package Models.Address;

public class BusinessAddress implements Address{
    private String city;
    private String town;
    private String street;
    private String apartment;

    public BusinessAddress(String city, String town, String street, String apartment) {
        this.city = city;
        this.town = town;
        this.street = street;
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    @Override
    public String getAddress() {
        String address = getTown() + " " + getStreet() + " " + getApartment() + " " + getCity();
        return address;
    }
}
