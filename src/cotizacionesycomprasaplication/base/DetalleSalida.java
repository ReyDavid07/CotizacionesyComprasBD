/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cotizacionesycomprasaplication.base;

/**
 *
 * @author REY
 */
public class DetalleSalida {

    private int idDetalleSalida;
    private int salidaId;
    private int bienId;
    private int cantidadEntregada;

    public DetalleSalida() {
    }

    public DetalleSalida(int idDetalleSalida, int salidaId, int bienId, int cantidadEntregada) {
        this.idDetalleSalida = idDetalleSalida;
        this.salidaId = salidaId;
        this.bienId = bienId;
        this.cantidadEntregada = cantidadEntregada;
    }
    
    
}
