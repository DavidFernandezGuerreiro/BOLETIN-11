
package boletin11.futbol;

/**
 *
 * @author dfernandezguerreiro
 */
public class SeleccionFutbol {
    protected int id;
    protected String nome;
    protected String apelido;
    protected int edade;

    public SeleccionFutbol(int id, String nome, String apelido, int edade) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.edade = edade;
    }

    public void concentrarse(){
        System.out.println("concentrase a selección");
    }
    public void viaxar(){
        System.out.println("viaxa a selección");
    }
    
    @Override
    public String toString() {
        return ("\nid: " + id + "\nnome: " + nome + "\napelido: " + apelido + "\nedade: " + edade);
    }  
}
