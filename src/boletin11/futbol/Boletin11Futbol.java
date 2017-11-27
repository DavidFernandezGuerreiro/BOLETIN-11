
package boletin11.futbol;

/**
 *
 * @author dfernandezguerreiro
 */
public class Boletin11Futbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instancio os obxetos e doulle valores.
        Xogador xogador1=new Xogador(111,"Pepe","Gutierrez",30,16,"147");
        Adestrador adestrador1=new Adestrador(222,"Manuel","Rodríguez",27,"258");
        Masaxista masaxista1=new Masaxista(333,"Pedro","Gonzalez",43,"Masaxista Profesional",4);
        
        //Obxeto da superclase , para intentar invocar un metodo da subclase
        SeleccionFutbol xogadorSeleccion=new SeleccionFutbol(444,"Roberto","Seleccion",35);
        
        xogador1.concentrarse();
        adestrador1.concentrarse();
        masaxista1.concentrarse();
        xogadorSeleccion.concentrarse();
        
        xogador1.viaxar();
        adestrador1.viaxar();
        masaxista1.viaxar();
        xogadorSeleccion.viaxar();
        
        System.out.println(xogador1.toString());
        System.out.println(adestrador1.toString());
        System.out.println(masaxista1.toString());
        System.out.println(xogadorSeleccion.toString()); 
    }
    
}
