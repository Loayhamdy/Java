
import java.io.*;
import java.nio.file.Files;
import java.util.*;


public class CitiesDAO {
    
     List<Cities> cities = new ArrayList<>();
            
    public List<Cities> readCitiessFromCsv(String rawFileName){

        File citiesFile = new File(rawFileName);
        List<String> lines = new ArrayList<>();
        try{
            lines = Files.readAllLines(citiesFile.toPath());
        }catch(IOException e){
            System.out.println("An Issue Has Been Happend"+e);
        }
        
        for (int lined = 1; lined < lines.size(); lined++){
            String line = lines.get(lined);
            
            String[] fields = line.split(",");
            
            for(int field = 0; field < fields.length; field++){
                fields[field] = fields[field].trim();
                
            }
            if(fields[3] != null && !fields[3].isEmpty())
            {
            Cities citizens = new Cities(Integer.parseInt(fields[0]),fields[1],fields[2],fields[3],Double.parseDouble(fields[4]));
            cities.add(citizens);
            }
            else
            {
            Cities citizens = new Cities(Integer.parseInt(fields[0]),fields[1],fields[2],"-1",Double.parseDouble(fields[4]));
            cities.add(citizens);
            }
            if(fields[4] != null && !fields[4].isEmpty())
            {
            Cities citizens = new Cities(Integer.parseInt(fields[0]),fields[1],fields[2],fields[3],Double.parseDouble(fields[4]));
            cities.add(citizens);
            }
            else
            {
            Cities citizens = new Cities(Integer.parseInt(fields[0]),fields[1],fields[2],fields[3],-1);
            cities.add(citizens);
            }
        }
        System.out.println("Total Number of Citiess is : "+cities.size());
        return cities;
    }
     

}
    
    
    