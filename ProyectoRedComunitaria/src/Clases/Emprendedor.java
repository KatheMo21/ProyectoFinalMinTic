
package Clases;

import java.util.ArrayList;
import java.util.Date;

/**
 * la clase Emprendedor mostrará los atributos de esta clase.
 * @author Katherin Monroy y Luis Felipe Alzate Osorio
 * @version 1.0.0
 * @since 2024 10 13
 */
public class Emprendedor {
    
    /**
    * el atributo idEmprendedor de tipo int  se refiere al identificador único del emprendedor.
    */
    private int id_emprendedor; 
    
    /**
    * el atributo id_pais_nacimiento de tipo int  se refiere al identificador único del pai fr naciemintos.
    */
    private int id_pais_nacimiento; 
    
    /**
    * el atributo id_usuario de tipo int  se refiere al identificador único del pai fr naciemintos.
    */
    private int id_usuario; 
    
    /**
    * el atributo nombre de tipo String  se refiere al nombre del emprendedor.
    */
    private String nombre; 
    
    /**
    * el atributo apellido de tipo String  se refiere al apellido del emprendedor.
    */
    private String apellido; 
    
    /**
    * el atributo edad de tipo String  se refiere a la edad del emprendedor.
    */
    private String edad; 
    
    /**
    * el atributo genero de tipo String  se refiere al genero al que pertenece el emprendedor.
    */
    private String genero; 
    
    /**
    * el atributo profesion de tipo String  se refiere a la profesion  que tiene el emprendedor.
    */
    private String profesion; 
    
    /**
    * el atributo añoNacimiento de tipo String  se refiere al año de nacimiento del emprendedor.
    */
    private String anio_nacimiento; 
    
    /**
    * el atributo mesNacimiento de tipo String  se refiere al mes de naciminto del emprendedor.
    */
    private String mes_nacimiento; 

    ////////////////////////////////////// CONSTRUCTOR ///////////////////////////////////////////////
    
    public Emprendedor(int id_emprendedor, int id_pais_nacimiento,int id_usuario, String nombre, String apellido, String edad, String genero, String profesion, String anio_nacimiento, String mes_nacimiento) {
        this.id_emprendedor = id_emprendedor;
        this.id_pais_nacimiento = id_pais_nacimiento;
        this.id_usuario = id_usuario; 
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.profesion = profesion;
        this.anio_nacimiento = anio_nacimiento;
        this.mes_nacimiento = mes_nacimiento;
        
    }

    public Emprendedor() {
        
    }
    
    ////////////////////////////////////////// METODOS DE ACCESO /////////////////////////////////

    public int getId_emprendedor() {
        return id_emprendedor;
    }

    public void setId_emprendedor(int id_emprendedor) {
        this.id_emprendedor = id_emprendedor;
    }

    public int getId_pais_nacimiento() {
        return id_pais_nacimiento;
    }

    public void setId_pais_nacimiento(int id_pais_nacimiento) {
        this.id_pais_nacimiento = id_pais_nacimiento;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getAnio_nacimiento() {
        return anio_nacimiento;
    }

    public void setAnio_nacimiento(String año_nacimiento) {
        this.anio_nacimiento = año_nacimiento;
    }

    public String getMes_nacimiento() {
        return mes_nacimiento;
    }

    public void setMes_nacimiento(String mes_nacimiento) {
        this.mes_nacimiento = mes_nacimiento;
    }
    
    /////////////////////////////////////////// METODOS /////////////////////////////////////7

    @Override
    public String toString() {
        return "Emprendedor{" + "id_emprendedor=" + id_emprendedor + ", id_pais_nacimiento=" + id_pais_nacimiento + ", id_usuario=" + id_usuario + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero + ", profesion=" + profesion + ", anio_nacimiento=" + anio_nacimiento + ", mes_nacimiento=" + mes_nacimiento + '}';
    }

    
}
