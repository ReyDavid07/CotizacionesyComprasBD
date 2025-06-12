/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cotizacionesycomprasaplication.base;

/**
 *
 * @author REY
 */
public class Bien {
    private int idBien;
    private String codigoUniversal;
    private String nombreBien;
    private String tipoBien;

    public Bien() {
    }

    public Bien(int idBien, String codigoUniversal, String nombreBien, String tipoBien) {
        this.idBien = idBien;
        this.codigoUniversal = codigoUniversal;
        this.nombreBien = nombreBien;
        this.tipoBien = tipoBien;
    }
    
    
}
