import java.util.List;

public class RecomendadorPorPreferencias implements IRecomendador {
    private String preferenciasUsuario;
    private ServicioRecomendacionPreferencias servicioRecomendacionPreferencias;

    public RecomendadorPorPreferencias(String preferenciasUsuario, ServicioRecomendacionPreferencias servicioRecomendacionPreferencias) {
        this.preferenciasUsuario = preferenciasUsuario;
        this.servicioRecomendacionPreferencias = servicioRecomendacionPreferencias;
    }

    @Override
    public List<String> recomendar() {
        return servicioRecomendacionPreferencias.generarRecomendaciones(preferenciasUsuario);
    }
}
