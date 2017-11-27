
package boletin11.futbol;

/**
 *
 * @author dfernandezguerreiro
 */

public class Xogador extends SeleccionFutbol {
    private int dorsal;
    private String demarcacion;

    public Xogador(int id, String nome, String apelido, int edade, int dorsal, String demarcacion) {
        super(id, nome, apelido, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }
    
    

    public void xogarPartido(){
        
    }
    
    public void entrenar(){
        
    }
    
    @Override
    public void viaxar(){
        System.out.println("viaxan os xogadores...");
    }
    
    @Override
    public String toString() {
        return ("Xogador: " + super.toString() + "\ndorsal: " + dorsal + "\ndemarcacion: " + demarcacion);
    }
}
