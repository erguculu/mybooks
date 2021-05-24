package books;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class WriteToTxt {
    public static void saveISBNToCSV(String fileName, List<String> list) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append("ISBN" + " -- " + DateUtil.todaysDate() + "\n" );
            for (int i = 0; i <list.size() ; i++) {
                writer.append(list.get(i) + "\n");
            }

            writer.close();
        } catch (Exception e) {

        }
    }
}
