/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cotizacionesycomprasaplication.base;

/**
 *
 * @author REY
 */
public class DetalleCotizacion {
    private int idDetalle;
    private int cotizacionId;
    private int bienId;
    private double precioCotizado;

    public DetalleCotizacion() {
    }

    public DetalleCotizacion(int idDetalle, int cotizacionId, int bienId, double precioCotizado) {
        this.idDetalle = idDetalle;
        this.cotizacionId = cotizacionId;
        this.bienId = bienId;
        this.precioCotizado = precioCotizado;
    }
    
    
}
