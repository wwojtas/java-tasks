package programowanieSieciowe;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class JSONExchangeRatesExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://api.exchangeratesapi.io/v1/latest?access_key=678de9eb5c8dbfc316ff6114b38bd0d8&base = GBP&symbols = USD,AUD,CAD,PLN,MXN");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        if (connection.getResponseCode() != 200){
            System.out.println("Not 200 response, quit");
            return;
        }
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream())
        );
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        while ( (str = reader.readLine()) != null ) {
            stringBuffer.append(str);
        }

        String jsonStr = stringBuffer.toString();
        System.out.println(jsonStr);

        JSONObject jsonObject = new JSONObject(jsonStr);
        JSONObject rates = jsonObject.getJSONObject("rates");
        String dateStr = jsonObject.getString("date");
        System.out.println("Rates date: " + dateStr);
        System.out.println("Base: " + jsonObject.getString("base"));

        Map<String, Object> objectMap = rates.toMap();

        objectMap.forEach((k,v)-> System.out.println(k + " : " + v));


        reader.close();

    }
}
