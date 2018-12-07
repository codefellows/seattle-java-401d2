import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesystemQuotes {
    public static Quote[] getQuotes(String path) throws IOException {
        BufferedReader reader = Files.newBufferedReader(Paths.get(path));
        StringBuilder json = new StringBuilder();
        String line = reader.readLine();
        while (line != null) {
            json.append(line);
            line = reader.readLine();
        }
        Gson gson = new Gson();
        return gson.fromJson(json.toString(), Quote[].class);
    }
}
