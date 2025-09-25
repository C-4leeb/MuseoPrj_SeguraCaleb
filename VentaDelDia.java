import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase VentaDelDia(capa de lógica de negocios) representa el registro de los
 * boletos vendidos en el dia, contiene la fecha del dia de venta y la lista
 * de boletos vendidos en este dia.
 * @autor Luis Javier Chavarria Sanchaz (codigo original, Caleb Segura (transcripción y documentación) )
 * @version 2025-09-23 
 */
public class VentaDelDia
{   
    /**
     * fecha del dia de venta
     */
    private String fechaDeLaVenta;
    /**
     * lista de los boletos vendidos
     */
    private List<BoletoMuseo> boletosVendidos; 
    
     /**
     * Constructor que inicializa una dia de venta.
     */
    public VentaDelDia() {
     fechaDeLaVenta = establecerFechaDeLaVenta();
     boletosVendidos = new ArrayList<>();
     }
    
     /**
     * Devuelve la fecha actual en la que se esta inicializando la venta 
     * del dia
     * 
     * @return fecha actual en formato yyyy-MM-dd.
     */
    private String establecerFechaDeLaVenta() {
     DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
     return LocalDate.now().format(f);
     }
     
    /**
     * Registra un boleto en la lista de boletosVendidos
     * @param boleto de la clase BoletoMuseo
     */
    public void registrarVentaBoleto(BoletoMuseo boleto) {
     boletosVendidos.add(boleto);
     }
    
     /**
      * Calcula la suma del precio de todos los boletos vendidos
      * @return precio total de los boletos vendidos
      */
    public double calcularTotalVentaDelDia() {
     double total = 0.0;
     for (BoletoMuseo b : boletosVendidos) {
     total += b.getPrecio();
     }
     return total;
     }
     
    /**
     * Devuelve cadena con informacion de la venta del dia. Incluye 
     * la fecha del dia de venta, la cantidad de boletos vendidos,
     * detalle de cada uno de los boletos vendidos y el precio total de
     * la venta del dia.
     *
     * @return msg, una cadena con la información de la venta del dia.
     */
    public String toString() {
     String msg = "VentaDelDia\n";
     msg += " Fecha: " + fechaDeLaVenta + "\n";
     msg += " Cantidad de boletos: " + boletosVendidos.size() + "\n";
     msg += " Detalle:\n";
     for (BoletoMuseo b : boletosVendidos) {
     msg += " - Boleto #" + b.getNumeroBoleto() + " | " + b.getPrecio() + "\n";
     }
     msg += " Total: " + calcularTotalVentaDelDia();
     return msg;
     }
}