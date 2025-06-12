/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cotizacionesycomprasaplication.base;

/**
 *
 * @author REY
 */
public class ItemSolicitud {
    private int idItem;
    private String nombreBien;
    private int cantidad;
    private String unidadMedida;
    private double valorUnitario;
    private double total;
    private int solicitudId;
    private int bienId;

    public ItemSolicitud() {
    }

    public ItemSolicitud(int idItem, String nombreBien, int cantidad, String unidadMedida, double valorUnitario, double total, int solicitudId, int bienId) {
        this.idItem = idItem;
        this.nombreBien = nombreBien;
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
        this.valorUnitario = valorUnitario;
        this.total = total;
        this.solicitudId = solicitudId;
        this.bienId = bienId;
    }
    
    
}
