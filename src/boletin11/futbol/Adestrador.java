
package boletin11.futbol;

/**
 *
 * @author dfernandezguerreiro
 */

public class Adestrador extends SeleccionFutbol {
    private String idFederacion;

    public Adestrador(int id, String nome, String apelido, int edade, String idFederacion) {
        super(id, nome, apelido, edade);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }
    
    public void dirixirPartido(){
        
    }
    
    public void dirixirAdestramento(){
        
    }
    
    @Override
    public void viaxar(){
        System.out.println("viaxan os xogadores...");
    }
    
    @Override
    public String toString() {
        return ("Adestador: " + super.toString() + "\nid Federacion: " + idFederacion);
    }  
}
