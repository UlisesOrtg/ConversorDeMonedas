import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarCambio {
    Cambio buscaCambio (String moneda) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/22218a2f2a4ad2966a932204/latest/" + moneda);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            //System.out.println("Respuesta del API: "+response.body());
            return new Gson().fromJson(response.body(), Cambio.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontró el cambio", e);
        }
    }
}
