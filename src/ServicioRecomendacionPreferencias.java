import java.util.List;

public class ServicioRecomendacionPreferencias implements IServicioRecomendacion<String> {
    @Override
    public List<String> generarRecomendaciones(String preferenciasUsuario) {
        if (preferenciasUsuario.equalsIgnoreCase("Electrónica")) {
            return List.of("Smartphone", "Laptop", "Tablet", "Auriculares Bluetooth");
        } else if (preferenciasUsuario.equalsIgnoreCase("Ropa")) {
            return List.of("Camisa", "Pantalones", "Zapatos Deportivos");
        } else {
            return List.of("Producto Genérico 1", "Producto Genérico 2");
        }
    }
}
