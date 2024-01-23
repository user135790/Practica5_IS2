package co.agenciaviajes.negocio;

/**
 * Pago con tarjeta de crédito
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class PagoTarjetaCredito extends Pago {

    // Completar atributos
    private String codigo;
    private String franquicia;
    private String numeroTarjeta;
    private String codigoSeguridad;
    // Completar constructores, por defecto y y parametrizado

    public PagoTarjetaCredito(String codigo, String franquicia, String numeroTarjeta, String codigoSeguridad) {
        this.codigo = codigo;
        this.franquicia = franquicia;
        this.numeroTarjeta = numeroTarjeta;
        this.codigoSeguridad = codigoSeguridad;
    }
    public PagoTarjetaCredito() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }


    @Override
    public void registrarPago() {
        //Aqui vendria la logica para grabar en la base de datos
        System.out.println("------------------------------------------------------");

        System.out.println("Pago con tarjeta de crédito registrado en el sistema con éxito.");
        System.out.println("Cliente: " + this.getCliente().toString());
        System.out.println("Código de Seguridad: " + this.getCodigoSeguridad());
        System.out.println("Franquisia: " + this.getFranquisia());
        System.out.println("Número de tarjeta: " + this.getNumeroTarjeta());
        System.out.println("Valor: " + this.getValor());

    }
    
    // Completar getters and setters

    @Override
    public Cliente getCliente() {
        return cliente;
    }

    private String getFranquisia() {
        return franquicia;
        
    }

    @Override
    public int getValor() {
        return this.valor;
    }


    @Override
    public void setValor(int valor) {
        this.valor = valor;
    }


    @Override
    public void setCliente(Cliente cliente) {
       this.cliente = cliente;
    }

    @Override
    public void pago(Cliente cliente) {
        this.setCliente(cliente);
    }


}
