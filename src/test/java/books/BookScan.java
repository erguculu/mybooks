package books;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.List;

public class BookScan {

    @Test
    public void getIsbnList() {
        Response response = ApiUtilities.getMyCart();


        JsonPath json = response.jsonPath();

        List<String> allPanierISBN = json.getList("items.product.meta.ean");
        System.out.println(allPanierISBN);
        System.out.println(allPanierISBN.size());

        String filePath ="sepet_isbn_"+ DateUtil.todaysDate() + ".csv";
        WriteToTxt.saveISBNToCSV(filePath, allPanierISBN);

    }
}
