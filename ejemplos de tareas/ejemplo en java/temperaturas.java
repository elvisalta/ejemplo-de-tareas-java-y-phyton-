

/**
 *
 * @author pc
 */
public class temperaturas {ublic class ClimaDiario {
    private String fecha;
    private double temperaturaMaxima;
    private double temperaturaMinima;
    private double precipitaciones;

    // Constructor
    public ClimaDiario(String fecha, double temperaturaMaxima, double temperaturaMinima, double precipitaciones) {
        this.fecha = fecha;
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
        this.precipitaciones = precipitaciones;
    }

    // Método para obtener información
    public String obtenerInformacion() {
        return "Fecha: " + fecha +
               ", Temperatura Máxima: " + temperaturaMaxima +
               ", Temperatura Mínima: " + temperaturaMinima +
               ", Precipitación: " + precipitaciones;
    }

    // Método para calcular el promedio
    public double calcularPromedioTemperatura() {
        return (temperaturaMaxima + temperaturaMinima) / 2;
    }

    // Método para registrar (actualizar) datos
    public void registrarDatos(String fecha, double temperaturaMaxima, double temperaturaMinima, double precipitaciones) {
        this.fecha = fecha;
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
        this.precipitaciones = precipitaciones;
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        ClimaDiario dia1 = new ClimaDiario("2025-06-10", 28, 18, 0.0);
        ClimaDiario dia2 = new ClimaDiario("2025-06-11", 30, 20, 5.0);

        System.out.println(dia1.obtenerInformacion());
        System.out.println("Promedio de temperatura de " + dia1.fecha + ": " + dia1.calcularPromedioTemperatura());

        // Actualizar información
        dia1.registrarDatos("2025-06-12", 32, 22, 0.5);
        System.out.println(dia1.obtenerInformacion());
    
}
