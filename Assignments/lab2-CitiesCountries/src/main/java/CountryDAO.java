   
import java.io.*;
import java.nio.file.Files;
import java.util.*;


public class CountryDAO{
    
    List<Countries> country;
            
    public List<Countries> readcountrysFromCsv(String rawFileName){
        
        this.country = new ArrayList<Countries>();
        File countrysFile = new File(rawFileName);
        List<String> lines = new ArrayList<String>();
        try{
            lines = Files.readAllLines(countrysFile.toPath());
        }catch(Exception e){
            System.out.println("An Issue Has Been Happend"+e);
        }
        
        for (int lineidx = 1; lineidx < lines.size(); lineidx++){
            String line = lines.get(lineidx);
            
            String[] fields = line.split(",");
            
            for(int fieldidx = 0; fieldidx < fields.length; fieldidx++){
                fields[fieldidx] = fields[fieldidx].trim();
                
            }
            Countries countrya = new Countries(fields[0],fields[1]);
            country.add(countrya);
            }

        System.out.println("Total Number of countrys is : "+country.size());
        return country;
    }
     

}
    

