import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.*;

public class HistorialCambio {
    public void guardarJscon(String base, String destino, Double tasaDestino, Double cambio, double monto) throws IOException {
        String nombreArchivo = base.toUpperCase() + "_A_" + destino.toUpperCase() + ".json";
        List<Map<String, Object>> historial = new ArrayList<>();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Leer historial existente si el archivo ya existe
        File archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            try (Reader reader = new FileReader(archivo)) {
                Type listType = new TypeToken<List<Map<String, Object>>>(){}.getType();
                List<Map<String, Object>> existente = gson.fromJson(reader, listType);
                if (existente != null) historial.addAll(existente);
            } catch (Exception ignored) {}
        }

        // Agregar el nuevo resultado
        Map<String, Object> resultado = new HashMap<>();
        resultado.put("Moneda Base", base.toUpperCase());
        resultado.put("Moneda Destino", destino.toUpperCase());
        resultado.put("Cantidad", cambio);
        resultado.put("Monto", monto);
        resultado.put("Fecha", LocalDate.now().toString());
        historial.add(resultado);

        // Guardar la lista actualizada
        try (Writer writer = new FileWriter(nombreArchivo)) {
            gson.toJson(historial, writer);
        }
    }
}