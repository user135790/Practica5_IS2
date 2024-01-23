package co.agenciaviajes.negocio;

/**
 * Clase abstracta de pagos
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public abstract class Pago {

    protected int valor;
    protected Cliente cliente;
      
    // Completar constructores
    public abstract void pago(Cliente cliente);
    public  abstract int getValor();
    public  abstract void setValor(int valor);
    public  abstract Cliente getCliente();
    public  abstract void setCliente(Cliente cliente);
    public abstract void registrarPago();

   

}
