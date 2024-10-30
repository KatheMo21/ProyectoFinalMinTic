
package Clases;

import java.util.ArrayList;

/**
 * la clase GestionInformacion mostrará los atributos de esta clase.
 * @author Katherin Monroy y Luis Felipe Alzate Osorio
 * @version 1.0.0
 * @since 2024 10 13
 */

public class GestionInformacion {
    
    /**
    * el atributo fechaGeneracion de tipo String  se refiere a la fecha de generación del sistema.
    */
    private String fechaGeneracion; 
    
    /**
    * el atributo emprendedor de tipo Emprendedor 
    */
    private Emprendedor emprendedor; 
    
    /**
    * el atributo pais de tipo Pais para asignarlo
    */
    
    /**
    * el atributo ArrayList de tipo Proyecto  se refiere a la lista de proyectos.
    */
    private ArrayList <Proyecto> listaProyectos; 
    
    /**
    * el atributo ArrayList de tipo Pais  se refiere a la lista de los paises.
    */
    private ArrayList <Pais> listaPaises;
    
    ////////////////////////////////////////////// CONSTRUCTOR /////////////////////////////////

//    public GestionInformacion(String fechaGeneracion) {
//        this.fechaGeneracion = fechaGeneracion;
//        this.emprendedor=new Emprendedor();
//        this.listaPaises= new ArrayList<>();
//    }
//    
//    //////////////////////////////////////// METODOS DE ACCESO /////////////////////////////////////7
//
//    public String getFechaGeneracion() {
//        return fechaGeneracion;
//    }
//
//    public void setFechaGeneracion(String fechaGeneracion) {
//        this.fechaGeneracion = fechaGeneracion;
//    }
//    
//    //////////////////////////////////////// METODOS //////////////////////////////////////////////
//    
//    /**
//    * el método toString devuelve  una cadena con todos los atributos del sistema.
//    * @param  no recibe parámetros.
//    * @return retorna una cadena.
//    */
//    @Override
//    public String toString(){
//        return "GestionInformacion{" + "fechaGeneracion=" + fechaGeneracion + ", emprendedor=" + emprendedor + ", listaProyectos=" + emprendedor.getListaProyectos()+ ", listaPaises=" + listaPaises + '}'; 
//    }
//
//    /**
//     * el método agregarProyecto agrega un proyecto a la lista.
//     * @param  recibe como parametros una proyecto tipo Proyecto
//     * @return un booleano
//     */
//    public boolean agregarProyecto(Proyecto p) {
//        return this.emprendedor.agregarProyecto(p); 
//    }
//    
//    /**
//    * el método buscarProyecto busca un proyecto en la lista
//    * @param  recibe como parametros un idProyecto tipo String
//    * @return retorna null.
//    */
//    
//    public Proyecto buscarProyecto(String idProyecto){
//        return this.emprendedor.buscarProyecto(idProyecto); 
//    }
//    
//    
//    /**
//    * el método eliminarProyecto elimina el proyecto de la lista.
//    * @param  recibe como parametros un idProyecto tipo String
//    * @return no retorna
//    */
//    public boolean eliminarProyecto(String idProyecto){
//        return this.emprendedor.eliminarProyecto(idProyecto); 
//    }
//    
//    
//    /**
//    * el método modificarProyecto modifica el proyecto.
//    * @param  recibe como parametros un idProyecto tipo String y un proyecto de tipo Proyecto
//    * @return no retorna
//    */
//    public boolean modificarProyecto(String idProyecto, Proyecto proyecto){
//        return this.emprendedor.modificarProyecto(idProyecto, proyecto);
//    }
//    
//    
//    /**
//    * el método agregarEmprendedor agrega un emprendedor a la lista.
//    * @param  recibe como parametros una proyecto tipo Proyecto
//    * @return un booleano
//    */
//    
//    public boolean agregarPais(Pais pais){
//        return this.listaPaises.add(pais);
//    }
//    
//    /**
//    * el método buscarPais busca un pais en la lista
//    * @param  recibe como parametros un idProyecto tipo String
//    * @return retorna null.
//    */
//    
//    public Pais buscarPais(String codigo){
//        
//        for (Pais p : listaPaises) {
//            if(p.getCodigo()== codigo){
//                return p;
//            }
//        }
//        return null;
//    }
//    
//    /**
//    * el método eliminarPais elimina el pais de la lista.
//    * @param  recibe como parametros un idProyecto tipo String
//    * @return no retorna
//    */
//    public boolean eliminarPais(String codigo){
//        int index = this.buscarIndicePais(codigo);
//        if(index >0){
//            this.listaPaises.remove(index);
//            return true;
//        }else{
//            return false;
//        }
//    }
//    /**
//    * el método buscarIndicePais busca el indice del pais
//    * @param  recibe como parametros un numeroIdentificacion tipo String.
//    * @return retorna un int
//    */
//    private int buscarIndicePais(String codigo){
//        
//        for(int i=0;i<this.listaPaises.size();i++){
//            Pais p = this.listaPaises.get(i);
//            if(p.getCodigo()== codigo){
//                return i;
//            }
//        }
//        return -1;
//    }
//    
//    /**
//    * el método modificarPais modifica el pais.
//    * @param  recibe como parametros un idProyecto tipo String y un proyecto de tipo Proyecto
//    * @return no retorna
//    */
//    public boolean modificarPais(String codigo, Pais pais){
//        int index = this.buscarIndicePais(codigo);
//        if(index >0){
//            this.listaPaises.set(index, pais);
//            return true;
//        }else{
//            return false;
//        }
//    }
}
