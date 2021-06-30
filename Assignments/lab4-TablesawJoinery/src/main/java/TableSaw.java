import tech.tablesaw.api.*;
import java.io.IOException;

public class TableSaw {

    public static void main(String[] args) {

        String path = "C:\\Users\\HEI-1001\\Downloads\\titanic.csv";

        try {
            Table df = Table.read().csv(path);
            System.out.println(df.structure());
            System.out.println(df.summary());

            Table df2 = df.select("name",  "survived", "sex");
            System.out.println(df2.structure());

            int[] genders = df.stream().mapToInt(row -> {
                String gender = row.getString("sex");
                if (gender.equals("male"))
                    return 1;
                else
                    return 0;
            }).toArray();

            IntColumn genderColumn = IntColumn.create("gender", genders);
            df.addColumns(genderColumn);
            System.out.println(df.summary());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}