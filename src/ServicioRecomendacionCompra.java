import java.util.ArrayList;
import java.util.List;

public class ServicioRecomendacionCompra implements IServicioRecomendacion<List<String>> {
    @Override
    public List<String> generarRecomendaciones(List<String> productosComprados) {
        List<String> recomendaciones = new ArrayList<>();
        for (String producto : productosComprados) {
            switch (producto.trim().toLowerCase()) {
                case "laptop" -> recomendaciones.addAll(List.of("Mouse inalámbrico", "Funda para laptop", "Teclado externo"));
                case "smartphone" -> recomendaciones.addAll(List.of("Cargador inalámbrico", "Funda protectora", "Auriculares Bluetooth"));
                case "camisa" -> recomendaciones.addAll(List.of("Corbata", "Pantalones", "Zapatos formales"));
                default -> recomendaciones.add(producto + " - Producto relacionado genérico");
            }
        }
        return recomendaciones;
    }
}
