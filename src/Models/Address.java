package Models;

import javax.persistence.Embeddable;

/**
 * Created by Burak Köken on 29.5.2017.
 */
@Embeddable
public class Address {

    private String street;
    private String city;

    public Address(){

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
}
