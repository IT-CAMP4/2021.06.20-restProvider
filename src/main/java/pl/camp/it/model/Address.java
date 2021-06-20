package pl.camp.it.model;

public class Address {
    private String street;
    private String city;
    private String number;
    private String code;

    public Address(String street, String city, String number, String code) {
        this.street = street;
        this.city = city;
        this.number = number;
        this.code = code;
    }

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
