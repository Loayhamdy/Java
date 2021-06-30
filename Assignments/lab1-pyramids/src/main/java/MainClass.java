import java.util.List;
import java.util.stream.DoubleStream;

public class MainClass {

    static String path;

    static {
        path = "C:\\Users\\HEI-1001\\Downloads\\pyramids.csv";
    }

    public static void main(String[] args){
    
        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        List<Pyramid> Pyramids = pDAO.readPyramidsFromCsv(path);
        
        int i =0 ;
        for(Pyramid p: Pyramids)
        {
            System.out.println("#"+(i++)+p);
        }
            //////////////////////////////////////
    
    List<Pyramid> list = pDAO.readPyramidsFromCsv(path);
    DoubleStream sortedAges = list.stream().mapToDouble(Pyramid::getHeight).sorted();
    double median = list.size()%2 == 0?
    sortedAges.skip(list.size()/2-1).limit(2).average().getAsDouble():        
    sortedAges.skip(list.size()/2).findFirst().getAsDouble();
    
    //////////////////////////////////////
        
    }
    
}