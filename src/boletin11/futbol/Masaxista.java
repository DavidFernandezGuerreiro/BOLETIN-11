
package boletin11.futbol;

/**
 *
 * @author dfernandezguerreiro
 */

public class Masaxista extends SeleccionFutbol {
    private String titulacion;
    private int anosExperiencia;

    public Masaxista(int id, String nome, String apelido, int edade, String titulacion, int anosExperiencia) {
        super(id, nome, apelido, edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void darMasaxes(){
        
    }

    @Override
    public void viaxar(){
        System.out.println("viaxan os xogadores...");
    }
    
    @Override
    public String toString() {
        return ("Masaxista: " + super.toString() + "\ntitulacion: " + titulacion + "\nanos de experiencia: " + anosExperiencia);
    }  
}
