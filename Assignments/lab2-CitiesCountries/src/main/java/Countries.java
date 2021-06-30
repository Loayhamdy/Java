
public class Countries {

    private String country;
    private String code; 

    public Countries(String country, String code) {
        this.country = country;
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public String getCode() {
        return code;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Countries{" + "country=" + country + ", code=" + code + '}';
    }
    
    
    
}
