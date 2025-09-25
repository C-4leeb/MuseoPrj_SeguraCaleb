/**
 * Clase Persona(capa de lógica de negocios) representa a la persona que 
 * posee un boleto de la clase BoletoMuseo, contiene informacion como el 
 * nombre de la persona, idetificacion y su boleto de la clase BoletoMuseo
 * @autor Luis Javier Chavarria Sanchaz (codigo original, Caleb Segura (transcripción y documentación) )
 * @version 2025-09-23 
 */
public class Persona
{
    /**
     * Nombre de la persona.
     */
    private String nombre;
    /**
     * Identificacion de la persona.
     */
    private String identificacion;
    /**
     * El boleto que posee la persona 
     */
    private BoletoMuseo miBoleto; 
    
    /**
     * Constructor que inicializa una persona con su nombre y identificacion.
     * @param nombre de la persona.
     * @param ident, identificacion de la persona.
     */
    public Persona(String nombre, String ident) {
     this(nombre);
     identificacion = ident;
    }
    
    /**
     * Constructor que inicializa una persona unicamente con su nombre.
     * @param nombre de la persona.
     */
    public Persona(String nombre) {
     this.nombre = nombre;
     }
    
     /**
     *establece la identificacion de una persona.
     *@param pIdentificacion, idetificacion a establecer
     */
    public void setIdentificacion(String pIdentificacion) {
     identificacion = pIdentificacion;
    } 
    
    /**
     *Asigna un boleto de la clase BoletoMuseo a una persona.
     *@param pMiBoleto, boleto de la clase BoletoMuseo a asignar.
     */
    public void asignarBoleto(BoletoMuseo pMiBoleto) {
     miBoleto = pMiBoleto;
     }
    
     /**
     *Devuelve el numero de boleto que tiene la persona
     *@return numero de boleto que tiene la persona
     */
    public int consultarMiNumeroDeBoleto() {
     return miBoleto.getNumeroBoleto();
     }
    
     /**
     * Devuelve cadena con informacion de la persona. Incluye el nombre,
     * la identificacion y su boleto asignado.
     *
     * @return msg, una cadena con la información de la persona.
     */
    public String toString() {
     String msg = "Persona\n";
     msg += " Nombre: " + nombre + "\n";
     msg += " Identificacion: " + identificacion + "\n";
     if (miBoleto != null) {
     msg += " Boleto asignado: #" + miBoleto.getNumeroBoleto() + "\n";
     } else {
     msg += " Boleto asignado: (ninguno)\n";
     }
     return msg;
     }
}