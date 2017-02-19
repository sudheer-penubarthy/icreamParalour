package com.entity;

import javax.persistence.*;

/**
 * Class for icreamParalour project
 * Created by sudheer on 19/2/17.
 */
@Entity
@Table (name = "offices")
public class Offices {
    @Id
    @Column(name = "officeCode", nullable = false)
    private String officeCode;
    @Column(name = "city", nullable = false)
    private String  city;
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "addressLine1", nullable = false)
    private String addressLine1;
    @Column(name = "addressLine2")
    private String addressLine2;
    @Column(name = "state")
    private String state;
    @Column(name = "country", nullable = false)
    private String country;
    @Column(name = "postalCode", nullable = false)
    private String postalCode;
    @Column(name = "territory")
    private String territory;

    public Offices() {
    }

    @Override
    public String toString() {
        return "Offices{" +
               "officeCode='" + officeCode + '\'' +
               ", city='" + city + '\'' +
               ", phone='" + phone + '\'' +
               ", addressLine1='" + addressLine1 + '\'' +
               ", addressLine2='" + addressLine2 + '\'' +
               ", state='" + state + '\'' +
               ", country='" + country + '\'' +
               ", postalCode='" + postalCode + '\'' +
               ", territory='" + territory + '\'' +
               '}';
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }
}
