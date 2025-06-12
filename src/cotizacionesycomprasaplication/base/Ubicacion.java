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
public class Ubicacion {
    private int idUbicacion;
    private int bienId;
    private int responsableId;
    private String direccion;
    private Date fechaEntrega;

    public Ubicacion() {
    }

    public Ubicacion(int idUbicacion, int bienId, int responsableId, String direccion, Date fechaEntrega) {
        this.idUbicacion = idUbicacion;
        this.bienId = bienId;
        this.responsableId = responsableId;
        this.direccion = direccion;
        this.fechaEntrega = fechaEntrega;
    }
    
}
