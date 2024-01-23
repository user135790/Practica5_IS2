package co.agenciaviajes.negocio;
import co.agenciaviajes.negocio.Cliente;
/**
 * Pago en efectivo
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class PagoEfectivo extends Pago {

    @Override
    public void registrarPago() {
                //Aqui vendria la logica para grabar en la base de datos
        System.out.println("------------------------------------------------------");
        System.out.println("Pago efectivo registrado en el sistema con éxito.");
        System.out.println("Cliente: " + this.getCliente().toString());
        System.out.println("Valor: " + this.getValor());
    }

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

}
