import java.util.List;

public class Recomendador {
    private IRecomendador recomendador;

    public Recomendador(IRecomendador recomendador) {
        this.recomendador = recomendador;
    }

    public List<String> generarRecomendaciones() {
        return recomendador.recomendar();
    }
}
