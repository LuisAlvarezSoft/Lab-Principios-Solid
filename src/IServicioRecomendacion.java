import java.util.List;

public interface IServicioRecomendacion<T> {
    List<String> generarRecomendaciones(T criterio);
}
