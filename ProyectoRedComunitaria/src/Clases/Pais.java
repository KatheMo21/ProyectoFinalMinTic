
package Clases;

import java.util.ArrayList;

/**
 * la clase Proyecto mostrará los atributos de esta clase.
 * @author Katherin Monroy y Luis Felipe Alzate Osorio
 * @version 1.0.0
 * @since 2024 10 13
 */
public class Pais {
    
    /**
    * el atributo id_pais de tipo int  se refiere al nombre del pais.
    */
    private int id_pais; 
    
    /**
    * el atributo nombre de tipo String  se refiere al nombre del pais.
    */
    private String nombre; 
   
    
    /**
    * el atributo estado de tipo String  se refiere al nombre del emprendedor.
    */
    private String estado; 
    
    /**
    * el atributo poblacion de tipo double  se refiere a la poblacion del pais.
    */
    private double poblacion; 
    
    /**
    * el atributo poblacion de tipo String  se refiere al nombre de la ciudad.
    */
    private String ciudad; 
    
    /**
    * el atributo region de tipo String  se refiere a la region a la que pertenece.
    */
    private String region; 
    
    /**
    * el atributo latitud de tipo double  se refiere a la latitud a la que pertenece el pais.
    */
    private String latitud; 
    
    /**
    * el atributo longitud de tipo double  se refiere a la longitud a la que pertenece el pais.
    */
    private String longitud; 
    
    /**
    * el atributo calificacion_riesgo de tipo String  se refiere a la tasa de riesgo a la que pertenece el pais.
    */
    private String calificacion_riesgo; 
    
    /**
    * el atributo tasaImpuesto de tipo double  se refiere a la tasa de impuesto que maneja el pais.
    */
    private double tasa_impuesto; 
    
    
    
    
    
    ///////////////////////////////////////// CONSTRUCTOR //////////////////////////////////////////////

    public Pais(int id_pais, String nombre, String estado, double poblacion, String ciudad, String region, String latitud, String longitud, String calificacion_riesgo, double tasa_impuesto) {
        this.id_pais = id_pais;
        this.nombre = nombre;
        this.estado = estado;
        this.poblacion = poblacion;
        this.ciudad = ciudad;
        this.region = region;
        this.latitud = latitud;
        this.longitud = longitud;
        this.calificacion_riesgo = calificacion_riesgo;
        this.tasa_impuesto = tasa_impuesto;
    }

    public Pais() {
    }
    
    

    /////////////////////////////////////////// METODOS DE ACCESO///////////////////////////////////////////

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(double poblacion) {
        this.poblacion = poblacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getCalificacion_riesgo() {
        return calificacion_riesgo;
    }

    public void setCalificacion_riesgo(String calificacion_riesgo) {
        this.calificacion_riesgo = calificacion_riesgo;
    }

    public double getTasa_impuesto() {
        return tasa_impuesto;
    }

    public void setTasa_impuesto(double tasa_impuesto) {
        this.tasa_impuesto = tasa_impuesto;
    }

    
    ///////////////////////////////////////// METODOS ///////////////////////////////////////////
    
    /**
    * el método toString devuelve  una cadena con todos los atributos deL pais
    * @param  no recibe parámetros.
    * @return retorna una cadena.
    */
    
     @Override
    public String toString() {
        return "Pais{" + "id_pais=" + id_pais + ", nombre=" + nombre + ", estado=" + estado + ", poblacion=" + poblacion + ", ciudad=" + ciudad + ", region=" + region + ", latitud=" + latitud + ", longitud=" + longitud + ", calificacion_riesgo=" + calificacion_riesgo + ", tasa_impuesto=" + tasa_impuesto + '}';
    }
    

}
