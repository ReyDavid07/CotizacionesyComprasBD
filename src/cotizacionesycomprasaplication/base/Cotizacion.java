/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cotizacionesycomprasaplication.base;

import java.util.Date;

/**
 *
 * @author REY
 */
public class Cotizacion {
   private int idCotizacion;
    private int solicitudId;
    private String proveedorId;
    private Date fechaCotizacion;

    public Cotizacion() {
    }

    public Cotizacion(int idCotizacion, int solicitudId, String proveedorId, Date fechaCotizacion) {
        this.idCotizacion = idCotizacion;
        this.solicitudId = solicitudId;
        this.proveedorId = proveedorId;
        this.fechaCotizacion = fechaCotizacion;
    }
    
    
}
