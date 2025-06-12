/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cotizacionesycomprasaplication.base;

/**
 *
 * @author REY
 */
public class CentroCosto {
    private int idCentro;
    private String nombreCentro;
    private int empleadoId;

    public CentroCosto() {
    }

    public CentroCosto(int idCentro, String nombreCentro, int empleadoId) {
        this.idCentro = idCentro;
        this.nombreCentro = nombreCentro;
        this.empleadoId = empleadoId;
    }
    
    
}
