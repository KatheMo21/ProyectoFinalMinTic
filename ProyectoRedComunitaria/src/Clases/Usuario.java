
package Clases;

/**
 * la clase Usuario mostrará los atributos de esta clase.
 * @author Katherin Monroy y Luis Felipe Alzate Osorio
 * @version 1.0.0
 * @since 2024 10 13
 */
public class Usuario {
    
    /**
    * el atributo nombreUsuario de tipo int se refiere al id que tendra como usuario.
    */
    private int id_usuario; 
    
    /**
    * el atributo nombreUsuario de tipo String  se refiere al nombre que tendra como usuario.
    */
    private String nombre_usuario; 
    
    /**
    * el atributo contraseña de tipo String  se refiere a la contraseña del usuario.
    */
    private String contrasenia;
    
    
    /////////////////////////////////////// CONSTRUCTOR ////////////////////////////////////////////////

    public Usuario(int id_usuario, String nombre_suario, String contrasenia) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_suario;
        this.contrasenia = contrasenia;
    }

    public Usuario() {
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    /////////////////////////////////////// METODOS DE ACCESO //////////////////////////////////////
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    /////////////////////////////////////////// METODOS /////////////////////////////////////////

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", nombre_usuario=" + nombre_usuario + ", contrasenia=" + contrasenia + '}';
    }
    
    
    
    
    
}
