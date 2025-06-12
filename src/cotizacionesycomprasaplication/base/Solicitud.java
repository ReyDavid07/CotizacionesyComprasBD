
package cotizacionesycomprasaplication.base;

import java.util.Date;

/**
 *
 * @author REY
 */
public class Solicitud {
   private int idSolicitud;
    private Date fecha;
    private int empleadoId;
    private int centroId;
    private int rubroId; 

    public Solicitud() {
    }

    public Solicitud(int idSolicitud, Date fecha, int empleadoId, int centroId, int rubroId) {
        this.idSolicitud = idSolicitud;
        this.fecha = fecha;
        this.empleadoId = empleadoId;
        this.centroId = centroId;
        this.rubroId = rubroId;
    }
    
}
