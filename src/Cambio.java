import java.util.Map;

public record Cambio(String time_last_update_utc,
                     String base_code,
                     Map<String, Double> conversion_rates) {

}
