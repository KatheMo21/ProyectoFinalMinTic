
package mintic.proyectoredcomunitaria.main;

import Clases.Emprendedor;
import Clases.GestionInformacion;
import Clases.Pais;
import Clases.Proyecto;
import Clases.Usuario;

/**
 * la clase GProyectoRedcomunitaria será la clase Main en donde se crearán los objetos.
 * @author Katherin Monroy y Luis Felipe Alzate Osorio
 * @version 1.0.0
 * @since 2024 10 13
 */
public class ProyectoRedComunitariaApp {
    
    public static void main(String[] args) {
        
        // instancia se usuario.
        Usuario usuarioUno = new Usuario("Elon_Musk","Elon1234"); 
        Usuario usuarioDos = new Usuario(" Mark_Zuckerberg","Meta567"); 
        Usuario usuarioTres = new Usuario("Steve_Jobs","Iphone56"); 
        
        // Instancia de Pais: 
        Pais pais1 = new Pais ("Sudáfrica","South","No Aplica",60000000,"Pretoria","Sur","19","42","AAA",0.3); 
        
        // Instancia de Emprendedor: 
        Emprendedor e1 = new Emprendedor("Elon","Musk","1234",53,"Ingeniero","Masculino","1971","06","28",pais1,usuarioUno); 
        
        // Instancia Proyecto: 
        
        Proyecto p1 = new Proyecto("Tesla34","Tesla,SpaceX","Tecnologíco","Tesla",180000,pais1);
        
        // GestionInformacion
        
        GestionInformacion g1=new GestionInformacion("2024-10-13");
        g1.agregarPais(pais1);
        g1.agregarProyecto(p1);
        
        
    }
    
}
