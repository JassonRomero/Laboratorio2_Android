package models;


public class ByCountry {

    private String Country;

    private String CountryCode;

    private String Province;

    private String City;

    private String CityCode;

    private String Lat;

    private String Lon;

    private Integer Cases;

    private String Status;

    private String Date;

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public ByCountry withCountry(String Country) {
        this.Country = Country;
        return this;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    public ByCountry withCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
        return this;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String Province) {
        this.Province = Province;
    }

    public ByCountry withProvince(String Province) {
        this.Province = Province;
        return this;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public ByCountry withCity(String City) {
        this.City = City;
        return this;
    }

    public String getCityCode() {
        return CityCode;
    }

    public void setCityCode(String CityCode) {
        this.CityCode = CityCode;
    }

    public ByCountry withCityCode(String CityCode) {
        this.CityCode = CityCode;
        return this;
    }

    public String getLat() {
        return Lat;
    }

    public void setLat(String Lat) {
        this.Lat = Lat;
    }

    public ByCountry withLat(String Lat) {
        this.Lat = Lat;
        return this;
    }

    public String getLon() {
        return Lon;
    }

    public void setLon(String Lon) {
        this.Lon = Lon;
    }

    public ByCountry withLon(String Lon) {
        this.Lon = Lon;
        return this;
    }

    public Integer getCases() {
        return Cases;
    }

    public void setCases(Integer Cases) {
        this.Cases = Cases;
    }

    public ByCountry withCases(Integer Cases) {
        this.Cases = Cases;
        return this;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ByCountry withStatus(String Status) {
        this.Status = Status;
        return this;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public ByCountry withDate(String Date) {
        this.Date = Date;
        return this;
    }
}

