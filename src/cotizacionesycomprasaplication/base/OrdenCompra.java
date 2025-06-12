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
public class OrdenCompra {
    private int idOrden;
    private String proveedorId;
    private Date fechaOrden;
    private double montoTotal;
    private Date fechaEntrega;
    private String estado;
    private int solicitudId;  

    public OrdenCompra() {
    }

    public OrdenCompra(int idOrden, String proveedorId, Date fechaOrden, double montoTotal, Date fechaEntrega, String estado, int solicitudId) {
        this.idOrden = idOrden;
        this.proveedorId = proveedorId;
        this.fechaOrden = fechaOrden;
        this.montoTotal = montoTotal;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
        this.solicitudId = solicitudId;
    }
    
    
}
