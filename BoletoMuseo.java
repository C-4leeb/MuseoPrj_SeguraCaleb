import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Clase BoletoMuseo (capa de lógica de negocios) que representa al boleto de 
 * entrada a un museo, la cual contiene informacion como el precio, numero de boleto
 * fecha de emision y un contador estatico de la cantidad de boletos inicializados
 * @autor Luis Javier Chavarria Sanchaz (codigo original, Caleb Segura (transcripción y documentación) )
 * @version 2025-09-23 
 */

public class BoletoMuseo
{
    /**
     * Precio del boleto.
     */
    private double precio;
    /**
     * numero del boleto creado.
     */
    private int numeroBoleto;
    /**
     * fecha en que se creo el boleto.
     */
    private String fechaEmision;
    /**
     * Contador estatico de la cantidad de boletos creados.
     */
    private static int contador = 0;
    
    /**
     * Constructor que inicializa un boleto unicamente con el precio.
     * @param precio valor del boleto.
     */
    public BoletoMuseo(double precio){
        this.precio = precio;
        contador++;
        this.numeroBoleto = contador;
        this.fechaEmision = establecerFechaEmisionBoleto();
    }
    
     /**
     * Devuelve la fecha actual en la que se esta inicializando un boleto.
     * 
     * @return La fecha actual en formato yyyy-MM-dd.
     */
    private String establecerFechaEmisionBoleto(){
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(f);
    }
    
    /**
     * Devuelve la cantidad de boletos que se han emitido.
     * 
     * @return contador de boletos creados.
     */
    public static int getContador() {
     return contador;
     }
    
    /**
     * Devuelve el numero de boleto.
     * 
     * @return numeroBoleto, el numero de boleto creado.
     */
    public int getNumeroBoleto() {
     return numeroBoleto;
     }
    
     /**
     * Devuelve el valor del precio del boleto. 
     * 
     * @return precio, valor del precio.
     */
    public double getPrecio() {
     return precio;
     }
    
     /**
     * Devuelve cadena con informacion del boleto. Incluye el número,
     * el precio y la fecha de emisión.
     *
     * @return msg. una cadena con la información del boleto.
     */
     public String toString() {
     String msg = "BoletoMuseo\n";
     msg += " Numero: " + numeroBoleto + "\n";
     msg += " Precio: " + precio + "\n";
     msg += " Fecha Emision: " + fechaEmision;
     return msg;
    }
}