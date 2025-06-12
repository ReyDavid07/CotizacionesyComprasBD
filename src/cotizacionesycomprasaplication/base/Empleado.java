
package cotizacionesycomprasaplication.base;

/**
 *
 * @author REY
 */
public class Empleado {
     private int codigoEmpleado;
    private String nombre;
    private String cedula;
    private int areaId;

    public Empleado() {
    }

    public Empleado(int codigoEmpleado, String nombre, String cedula, int areaId) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombre = nombre;
        this.cedula = cedula;
        this.areaId = areaId;
    }
    
}
