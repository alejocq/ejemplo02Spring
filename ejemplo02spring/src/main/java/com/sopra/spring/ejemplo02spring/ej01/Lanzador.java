package com.sopra.spring.ejemplo02spring.ej01;

/**
 * Hello world!
 *
 */
public class Lanzador 
{
	private static BarDeCopas miBarDeCopasFavorito;
	
    public static void main( String[] args )
    {
        BarDeCopas elBuzon = new BarDeCopas(); 
        elBuzon.setNombre("El buzón de mierda");
        elBuzon.setCalidadDeLaBebida("XXXX");
        Lanzador.miBarDeCopasFavorito = elBuzon;
        System.out.println(miBarDeCopasFavorito);
        cambiamosDeCalidad();
        System.out.println(miBarDeCopasFavorito);
    }
    public static void cambiamosDeCalidad() {
    	miBarDeCopasFavorito.setCalidadDeLaBebida("XXX");
    	System.out.println(miBarDeCopasFavorito);
    }
}
