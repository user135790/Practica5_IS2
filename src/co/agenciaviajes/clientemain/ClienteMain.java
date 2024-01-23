package co.agenciaviajes.clientemain;

import co.agenciaviajes.negocio.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;
import co.agenciaviajes.negocio.FabricaPagos;
import co.agenciaviajes.negocio.Pago;
import co.agenciaviajes.negocio.PagoTarjetaCredito;
import co.agenciaviajes.negocio.PagoTarjetaDebito;

/**
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class ClienteMain {

    /**
     * Simula un objeto cliente que consume los servicios de la fábrica
     *
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException {
        FabricaPagos factory = new FabricaPagos();
        Cliente cliente = new Cliente("125478546", "Fernanda Maria", "Benavides", "F", "fer@gmail.com");
        int valorPago = 45600122;

        Pago pago; // Referencia a la clase base
        try {
            pago = factory.getPago("co.agenciaviajes.negocio.PagoEfectivo");
            pago.pago(cliente);
            pago.setValor(valorPago);
            pago.registrarPago();

            PagoTarjetaCredito pagoTarjetaCredito = (PagoTarjetaCredito)factory.getPago("co.agenciaviajes.negocio.PagoTarjetaCredito");
            pagoTarjetaCredito.setValor(valorPago); // Cualquier valor de una logica de negocio que aun no se tiene
            pagoTarjetaCredito.setCodigo("1254578");
            pagoTarjetaCredito.setCodigoSeguridad("1346");
            pagoTarjetaCredito.setFranquicia("VISA");
            pagoTarjetaCredito.setNumeroTarjeta("3154-123485-12547");
            pagoTarjetaCredito.pago(cliente);
            pagoTarjetaCredito.registrarPago();

            PagoTarjetaDebito pagoTarjetaDebito = (PagoTarjetaDebito)factory.getPago("co.agenciaviajes.negocio.PagoTarjetaDebito");
            
            pagoTarjetaDebito.setValor(valorPago);
            pagoTarjetaDebito.setCodigo("1254578");
            pagoTarjetaDebito.setBanco("BBVA");
            pagoTarjetaDebito.setNumeroCuenta("123123123");
            pagoTarjetaDebito.pago(cliente);
            pagoTarjetaDebito.registrarPago();
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(ClienteMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
