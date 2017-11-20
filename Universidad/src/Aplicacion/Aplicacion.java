package Aplicacion;

import Cargardatos.Cargardatos;

/**
 *
 * @author Estudiante
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cargardatos cargar = new Cargardatos();
       cargar.cargar("universidad");
       String sedes = cargar.listarSedes();
        System.out.println(sedes);
    }
    
}
