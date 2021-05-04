package org.example;

public class Address {
    private int zipcode;
    private String post;
    private String district;
    private String country;

    public Address() {
    }

    public Address(int zipcode, String post, String district, String country) {
        this.zipcode = zipcode;
        this.post = post;
        this.district = district;
        this.country = country;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address[" +
                "zipcode=" + zipcode +
                ", post='" + post + '\'' +
                ", district='" + district + '\'' +
                ", country='" + country + '\'' +
                ']';
    }
}
