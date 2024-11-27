import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\nSISTEMA DE RECOMENDACIÓN DE PRODUCTOS");
            System.out.println("1. Recomendaciones por compras anteriores");
            System.out.println("2. Recomendaciones por preferencias");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese los productos comprados previamente (separados por coma):");
                    String inputProductos = scanner.nextLine();
                    List<String> productosComprados = Arrays.asList(inputProductos.split(","));

                    ServicioRecomendacionCompra servicioCompra = new ServicioRecomendacionCompra();
                    Recomendador recomendadorPorCompra = new Recomendador(new RecomendadorPorCompra(productosComprados, servicioCompra));

                    List<String> recomendaciones = recomendadorPorCompra.generarRecomendaciones();
                    System.out.println("Recomendaciones basadas en tus compras:");
                    recomendaciones.forEach(System.out::println);
                }
                case 2 -> {
                    System.out.println("Ingrese sus preferencias (por ejemplo: Electrónica, Ropa, etc.):");
                    String preferencias = scanner.nextLine();

                    ServicioRecomendacionPreferencias servicioPreferencias = new ServicioRecomendacionPreferencias();
                    Recomendador recomendadorPorPreferencias = new Recomendador(new RecomendadorPorPreferencias(preferencias, servicioPreferencias));

                    List<String> recomendaciones = recomendadorPorPreferencias.generarRecomendaciones();
                    System.out.println("Recomendaciones basadas en tus preferencias:");
                    recomendaciones.forEach(System.out::println);
                }
                case 3 -> {
                    salir = true;
                    System.out.println("¡Gracias por usar el sistema de recomendación! Hasta pronto.");
                }
                default -> System.out.println("Opción inválida. Por favor, intente nuevamente.");
            }
        }
        scanner.close();
    }
}
