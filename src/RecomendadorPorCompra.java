import java.util.List;

public class RecomendadorPorCompra implements IRecomendador {
    private List<String> productosComprados;
    private ServicioRecomendacionCompra servicioRecomendacionCompra;

    public RecomendadorPorCompra(List<String> productosComprados, ServicioRecomendacionCompra servicioRecomendacionCompra) {
        this.productosComprados = productosComprados;
        this.servicioRecomendacionCompra = servicioRecomendacionCompra;
    }

    @Override
    public List<String> recomendar() {
        return servicioRecomendacionCompra.generarRecomendaciones(productosComprados);
    }
}
