
package Clases;

/**
 * la clase GestionInformacion mostrará los atributos de esta clase.
 * @author Katherin Monroy y Luis Felipe Alzate Osorio
 * @version 1.0.0
 * @since 2024 10 13
 */

public class GestionInformacion {
    
    private int Id_gestion;
    
    private int id_proyecto;
    /**
    * el atributo fechaGeneracion de tipo String  se refiere a la fecha de generación del sistema.
    */
    private String fechaGeneracion; 
    
    /**
    * el atributo emprendedor de tipo Emprendedor 
    */
    
    private int Id_emprendedor;
    
    
    
    
    ////////////////////////////////////////////// CONSTRUCTOR /////////////////////////////////

    public GestionInformacion() {
    }

    public GestionInformacion(int Id_gestion, int id_proyecto, String fechaGeneracion, int Id_emprendedor) {
        this.Id_gestion = Id_gestion;
        this.id_proyecto = id_proyecto;
        this.fechaGeneracion = fechaGeneracion;
        this.Id_emprendedor = Id_emprendedor;
    }

    public int getId_gestion() {
        return Id_gestion;
    }

    public void setId_gestion(int Id_gestion) {
        this.Id_gestion = Id_gestion;
    }

    public int getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(String fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public int getId_emprendedor() {
        return Id_emprendedor;
    }

    public void setId_emprendedor(int Id_emprendedor) {
        this.Id_emprendedor = Id_emprendedor;
    }

    @Override
    public String toString() {
        return "GestionInformacion{" + "Id_gestion=" + Id_gestion + ", id_proyecto=" + id_proyecto + ", fechaGeneracion=" + fechaGeneracion + ", Id_emprendedor=" + Id_emprendedor + '}';
    }
    
    
}
