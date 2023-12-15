import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static StringBuilder response;
    public static void main(String[] args) {
    //new ShopListGui();
    new ShoppingGuiForm();

}
    public static void getRequests(String databasePath) {


        try {

            // Create the URL for the HTTP GET request
            //URL url = new URL(databaseUrl + databasePath);
            URL url = new URL("https://fir-data-67806-default-rtdb.europe-west1.firebasedatabase.app/Shoppinglist.json");
            //URL url = new URL("https://www.cheapshark.com/api/1.0/deals?storeID=1&upperPrice=0.5");  // Cheapshark

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method to GET
            connection.setRequestMethod("GET"); //POST , PATCH , DELETE

            // Get the response code t.ex 400, 404, 200 är ok
            int responseCode = connection.getResponseCode();
            //  System.out.println("response code:" +responseCode);
            if (responseCode == HttpURLConnection.HTTP_OK) { // ok är bra
                // Read the response from the InputStream
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
               response = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

               /* String[] s = new String[]{
                    "hey","sam"
                };*/
               // System.out.println(s);
                //System.out.println(Arrays.toString(response.toString().split(",", 8)));
                reader.close();
              //  ShoppingGuiForm.textArea1.setText(String.valueOf(response).replaceAll("\"", "" ).replaceAll("\\{", "\n" ).replaceAll("\\}", "" ).replaceAll(",", "\n"));
                // Handle the response data
                System.out.println("Response from Firebase Realtime Database:");
                System.out.println(response);

                //System.out.println(ShopListGui.textArea2.getText());

            } else { //404 403 402 etc error koder
                // Handle the error response
                System.out.println("Error response code: " + responseCode);
            }

            // Close the connection
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}