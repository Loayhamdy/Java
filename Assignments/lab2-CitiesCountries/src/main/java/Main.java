import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        CountryDAO countriesDAO = new  CountryDAO();
        CitiesDAO citiesDAO = new CitiesDAO();

        
        List<Cities> cityList = citiesDAO.readCitiessFromCsv("C:\\Users\\HEI-1001\\Downloads\\cities.csv");

        List<Countries> countryList = countriesDAO.readcountrysFromCsv("‪C:/Users/HEI-1001/Downloads/countries.csv");
        
        Map<Integer, List<Cities>> countryCities = new HashMap<>();

        for (Cities c : cityList) {
            if (!countryCities.containsKey(c.city_id)) {
                List<Cities> cities = new ArrayList<>();
                cities.add(c);
                countryCities.put(c.city_id, cities);
            }
            else {
                countryCities.get(c.city_id).add(c);
            }
        }

        countryCities.forEach((k, v) -> v.stream().map(Cities::getPopulation).sorted().collect(Collectors.toList()));


    }
}