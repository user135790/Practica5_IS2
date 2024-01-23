package co.agenciaviajes.negocio;

/**
 * Fábrica de pagos, instancia objetos de la jerarquia de pagos
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class FabricaPagos {

    /**
     * Devuelve un objeto de la jerarquia de pagos mediante reflexión Reflexioin
     * es la capacidad que tiene un programa para observar y opcionalmente
     * modificar su estructura de alto nivel.
     *
     * @param nombrePago nombre de la clase a instanciar
     * @return Objeto de la jerarquía de Pagos
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public Pago getPago(String nombrePago) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return (Pago) Class.forName(nombrePago).newInstance();
    }

}
