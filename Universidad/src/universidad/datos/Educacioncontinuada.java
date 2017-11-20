/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.datos;

/**
 *
 * @author admin
 */
public class Educacioncontinuada extends Sede {
    private String cursomaspopular;
    public String getCursomaspopular() {
        return cursomaspopular;
    }
  
    public void setCursomaspopular(String cursomaspopular) {
        this.cursomaspopular = cursomaspopular;
    }
    
    public Educacioncontinuada(String nombre, int telefono, double areaconstruida, String cursomaspopular) {
        super(nombre, telefono, areaconstruida);
        this.cursomaspopular=cursomaspopular;
    }
      public String darinformacion() {

        return cursomaspopular+super.toString();
    }
    
}
