/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cotizacionesycomprasaplication.base;

/**
 *
 * @author REY
 */
public class DetalleOrden {
    private int idDetalleOrden;
    private int ordenId;
    private int bienId;
    private int cantidadSolicitada;
    private int cantidadDespachada;
    private String unidadMedida;
    private double valorUnitario;
    private double total;

    public DetalleOrden() {
    }

    public DetalleOrden(int idDetalleOrden, int ordenId, int bienId, int cantidadSolicitada, int cantidadDespachada, String unidadMedida, double valorUnitario, double total) {
        this.idDetalleOrden = idDetalleOrden;
        this.ordenId = ordenId;
        this.bienId = bienId;
        this.cantidadSolicitada = cantidadSolicitada;
        this.cantidadDespachada = cantidadDespachada;
        this.unidadMedida = unidadMedida;
        this.valorUnitario = valorUnitario;
        this.total = total;
    }
    
    
}
