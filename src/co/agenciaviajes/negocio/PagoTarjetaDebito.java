package co.agenciaviajes.negocio;

/**
 * Pago con tarjeta débito
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class PagoTarjetaDebito extends Pago {
    private String codigo;
    private String banco;
    private String numeroCuenta;


    @Override
    public Cliente getCliente() {
        return cliente;
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


    private String getBanco() {
        return this.banco;
    }

    private String getNumeroCuenta() {
       return this.numeroCuenta;
    }

    public void setCodigo(String string) {
       this.codigo=string;
    }

    public void setBanco(String banco) {
        this.banco=banco;
    }

    public void setNumeroCuenta(String string) {
        this.numeroCuenta = string;
    }
    @Override
    public void registrarPago() {
          
        System.out.println("------------------------------------------------------");

        System.out.println("Pago con tarjeta de debito registrado en el sistema con éxito.");
        
        System.out.println("Cliente: " + this.getCliente().toString());
        System.out.println("Banco: " + this.getBanco());
        System.out.println("Numero Cuenta: " + this.getNumeroCuenta());
        System.out.println("Valor: " + this.getValor());
    }

    
    

}
