package models;

public class Country {

    private String Country;

    private String Slug;

    private String ISO2;

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public Country withCountry(String Country) {
        this.Country = Country;
        return this;
    }

    public String getSlug() {
        return Slug;
    }

    public void setSlug(String Slug) {
        this.Slug = Slug;
    }

    public Country withSlug(String Slug) {
        this.Slug = Slug;
        return this;
    }

    public String getISO2() {
        return ISO2;
    }

    public void setISO2(String ISO2) {
        this.ISO2 = ISO2;
    }

    public Country withISO2(String ISO2) {
        this.ISO2 = ISO2;
        return this;
    }

}
