/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cotizacionesycomprasaplication.base;

/**
 *
 * @author REY
 */
public class DetalleEntrada {
    private int idDetalleEntrada;
    private int entradaId;
    private int bienId;
    private int cantidadEntregada; 

    public DetalleEntrada() {
    }

    public DetalleEntrada(int idDetalleEntrada, int entradaId, int bienId, int cantidadEntregada) {
        this.idDetalleEntrada = idDetalleEntrada;
        this.entradaId = entradaId;
        this.bienId = bienId;
        this.cantidadEntregada = cantidadEntregada;
    }
    
    
}
