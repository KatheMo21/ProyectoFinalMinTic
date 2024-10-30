
package Clases;

/**
 * la clase Proyecto mostrará los atributos de esta clase.
 * @author Katherin Monroy y Luis Felipe Alzate Osorio
 * @version 1.0.0
 * @since 2024 10 13
 */
public class Proyecto {
    
    /**
    * el atributo id_proyecto de tipo int  se refiere al identificador único del proyecto.
    */
    private int id_proyecto; 
    
    /**
    * el atributo id_emprendedor de tipo int  se refiere al identificador único del emprendedor.
    */
    private int id_emprendedor; 
    
    /**
    * el atributo id_pais_creacion de tipo int  se refiere al identificador único del pais de creacion.
    */
    private int id_pais_creacion; 
    
    /**
    * el atributo nombre de tipo String  se refiere al nombre del proyecto.
    */
    private String nombre; 
    
    /**
    * el atributo Sector_industrial de tipo String  se refiere al sector Industrial a la que pertenece el proyecto.
    */
    private String Sector_industrial; 
    
    /**
    * el atributo avaluo_proyecto de tipo double  se refiere al valor avaluado del proyecto
    */
    private double avaluo_proyecto; 
    
    
    /////////////////////////////////////////// CONSTRUCTOR //////////////////////////////////////

    public Proyecto(int id_proyecto, int id_emprendedor, int id_pais_creacion, String nombre, String Sector_industrial, double avaluo_proyecto) {
        this.id_proyecto = id_proyecto;
        this.id_emprendedor = id_emprendedor;
        this.id_pais_creacion = id_pais_creacion;
        this.nombre = nombre;
        this.Sector_industrial = Sector_industrial;
        this.avaluo_proyecto = avaluo_proyecto;
    }

    public Proyecto() {
    }

   
    
    //////////////////////////////////////////// METODOS DE ACCESO ////////////////////////////////////

    public int getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public int getId_emprendedor() {
        return id_emprendedor;
    }

    public void setId_emprendedor(int id_emprendedor) {
        this.id_emprendedor = id_emprendedor;
    }

    public int getId_pais_creacion() {
        return id_pais_creacion;
    }

    public void setId_pais_creacion(int id_pais_creacion) {
        this.id_pais_creacion = id_pais_creacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSector_industrial() {
        return Sector_industrial;
    }

    public void setSector_industrial(String Sector_industrial) {
        this.Sector_industrial = Sector_industrial;
    }

    public double getAvaluo_proyecto() {
        return avaluo_proyecto;
    }

    public void setAvaluo_proyecto(double avaluo_proyecto) {
        this.avaluo_proyecto = avaluo_proyecto;
    }

 
    ///////////////////////////////////////////// METODOS ////////////////////////////////////////////////

    /**
    * el método toString devuelve  una cadena con todos los atributos deL proyecto
    * @param  no recibe parámetros.
    * @return retorna una cadena.
    */
    
    @Override
    public String toString() {
        return "Proyecto{" + "id_proyecto=" + id_proyecto + ", id_emprendedor=" + id_emprendedor + ", id_pais_creacion=" + id_pais_creacion + ", nombre=" + nombre + ", Sector_industrial=" + Sector_industrial + ", avaluo_proyecto=" + avaluo_proyecto + '}';
    }
    
    
    
    
}
