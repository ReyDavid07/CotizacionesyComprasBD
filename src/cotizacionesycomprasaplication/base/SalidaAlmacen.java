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
public class SalidaAlmacen {
    private int idSalida;
    private Date fechaSalida;
    private Date fechaEntrega;
    private int responsableId; 

    public SalidaAlmacen() {
    }

    public SalidaAlmacen(int idSalida, Date fechaSalida, Date fechaEntrega, int responsableId) {
        this.idSalida = idSalida;
        this.fechaSalida = fechaSalida;
        this.fechaEntrega = fechaEntrega;
        this.responsableId = responsableId;
    }
    
    
}
