/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cotizacionesycomprasaplication.base;

/**
 *
 * @author REY
 */
public class rubroPresupuestal {
    private int idRubro;
    private String descripcion;
    private double presupuestoTotal;

    public rubroPresupuestal() {
    }

    public rubroPresupuestal(int idRubro, String descripcion, double presupuestoTotal) {
        this.idRubro = idRubro;
        this.descripcion = descripcion;
        this.presupuestoTotal = presupuestoTotal;
    }
    
}
