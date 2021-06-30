public class Cities {

    

     int city_id ; 
     String city;
     String country_id;
     String capital ;
     double population ;
    

    public Cities(int city_id, String city, String country_id, String capital, double population) {
        this.city_id = city_id;
        this.city = city;
        this.country_id = country_id;
        this.capital = capital;
        this.population = population;
    }

    
    public String getCity() {
        return city;
    }

    public String getCountry_id() {
        return country_id;
    }

    public String getCapital() {
        return capital;
    }

    public double getPopulation() {
        return population;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    @Override
    public String toString() {
        return "Cities{" + "city_id=" + city_id + ", city=" + city + ", country_id=" + country_id + ", capital=" + capital + ", population=" + population + '}';
    }
    
}
