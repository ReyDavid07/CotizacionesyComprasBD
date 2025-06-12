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
public class EntradaAlmacen {
    private int idEntrada;
    private Date fechaEntrada;
    private String numFactura;
    private String proveedorId;
    private int totalBienes;
    private double valorTotal;  

    public EntradaAlmacen() {
    }

    public EntradaAlmacen(int idEntrada, Date fechaEntrada, String numFactura, String proveedorId, int totalBienes, double valorTotal) {
        this.idEntrada = idEntrada;
        this.fechaEntrada = fechaEntrada;
        this.numFactura = numFactura;
        this.proveedorId = proveedorId;
        this.totalBienes = totalBienes;
        this.valorTotal = valorTotal;
    }
    
    
}
