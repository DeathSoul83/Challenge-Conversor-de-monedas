import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDivisa {
    public Moneda buscaDivisa(String monedaBase, String monedaTarget) {
        String apiKey = "715465fc4f893715e80a2f98";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + monedaBase + "/" + monedaTarget);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontré la moneda");
        }
    }
}
