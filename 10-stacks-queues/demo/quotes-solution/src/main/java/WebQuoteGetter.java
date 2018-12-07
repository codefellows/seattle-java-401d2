import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebQuoteGetter implements QuoteGetter {
    @Override
    public Quote getQuote() {
        try {
            // make request to API
            URL url = new URL("https://ron-swanson-quotes.herokuapp.com/v2/quotes");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder json = new StringBuilder();
            String line = in.readLine();
            while (line != null) {
                json.append(line);
                line = in.readLine();
            }
            in.close();
            Gson gson = new Gson();
            String[] parsedJson = gson.fromJson(json.toString(), String[].class);
            Quote answer = new Quote("Ron Swanson", parsedJson[0]);
            return answer;
        } catch (IOException e) {
            // something went wrong with the internet
            System.out.println("The Internet is down, but please don't commit crimes");
            System.out.println(e);
        }
        // get back quote data
        // turn into quote object
        // return quote object
        return null;
    }
}
