import joinery.DataFrame;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Joinery {

    public static void main(String[] args) {
        String path = "C:\\Users\\HEI-1001\\Downloads\\titanic.csv";
        try {
            DataFrame<Object> df = DataFrame.readCsv(path);
            System.out.println(df.describe());

            DataFrame<Object> df2 = df.retain("ticket","pclass","name", "age");
            System.out.println(df2.describe().toString());

            DataFrame<Object> Merged = df.merge(df2);
            System.out.println(Merged.tail(10));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static DataFrame addColumn(DataFrame df) {
        int rowCount = df.length();
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < rowCount; i++) {
            list.add((double) (i + 1));
        }
        return df.add(list);
    }
}